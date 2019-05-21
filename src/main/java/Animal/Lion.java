package Animal;

import Animal.Utils.FeedingDate;
import Animal.Utils.Marching;

import java.util.Scanner;

public class Lion extends Animals implements Cat {

    Scanner inp = new Scanner(System.in);
    private static boolean Lion_Create_User = false;
    private LionThread thread;

    public Lion() {
        if (Lion_Create_User) {
            try {
                name = inp.nextLine();
                System.out.println("Set name: ");
                age = inp.nextInt();
                System.out.println("Set age: ");
                weight = inp.nextDouble();
                System.out.println("Set weight: ");
            } catch (Exception ex) {
                System.out.println("Enter correct data");
            }
        } else {
            this.setName("African Lion");
            this.setAge(4);
            this.setWeight(70);
            this.date = new FeedingDate();
            this.thread = new LionThread();
            this.setStrategy(new Marching());
        }
    }
    public boolean isHungry() {
        int difference = date.calculateHowManyDaysWasFed();
        boolean isHungry = false;
        if (difference > 2){
            isHungry = true;
        }else
            isHungry = false;
        return isHungry;
    }
    public void makeSound() {
        thread.start();
    }
}
