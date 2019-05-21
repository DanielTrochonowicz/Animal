package Animal;

import Animal.Utils.FeedingDate;
import Animal.Utils.Marching;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cheetah extends Animals implements Cat{

    private static boolean Cheetah_Create_User = false;

    Scanner inp = new Scanner(System.in);


    public Cheetah() {
        if (Cheetah_Create_User) {
            try {
                name = inp.nextLine();
                System.out.println("Set name: ");
                age = inp.nextInt();
                System.out.println("Set age: ");
                weight = inp.nextDouble();
                System.out.println("Set weight: ");
            }catch (Exception ex) {
                System.out.println("Enter correct data");
            }
        }else {
            this.setName("Maned Cheetah: ");
            this.setAge(6);
            this.setWeight(60);
            this.date = new FeedingDate();
            this.setStrategy(new Marching());
        }
    }

    public boolean isHungry() {
        int difference = date.calculateHowManyDaysWasFed();
        boolean isHungry = false;
        if (difference > 1){
            isHungry = true;
        }else
            isHungry = false;
        return isHungry;
    }
    public void makeSound() {
        Runnable cheetahRunnable = new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("I am Cheetah, I am making Grrr sound");
                    try {
                        TimeUnit.SECONDS.sleep(60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(cheetahRunnable);
        thread.start();
    }
}
