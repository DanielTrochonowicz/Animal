package Animal;

import Animal.Utils.FeedingDate;
import Animal.Utils.Running;
import com.google.common.base.Strings;


import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Tiger extends Animals implements Cat {

    public Tiger(TigerBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.weight = builder.weight;
        this.date = builder.date;
        this.setStrategy(new Running());
    }

    public boolean isHungry() {
        int difference = date.calculateHowManyDaysWasFed();
        boolean isHungry = false;
        if (difference > 3){
            isHungry = true;
        }else
            isHungry = false;
        return isHungry;
    }
    public void makeSound() {
        Runnable tigerRunnable = new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("I am Tiger, I am making Trrr sound");
                    try {
                        TimeUnit.SECONDS.sleep(40);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        } ;
        Thread thread = new Thread(tigerRunnable);
        thread.start();
    }
    public static class TigerBuilder {
        private String name;
        private int age;
        private double weight;
        Random random = new Random();
        private FeedingDate date;

    public TigerBuilder(String name, int age) {
       try {
           if (Strings.isNullOrEmpty(name)){
               throw new IllegalArgumentException();
            }else{
               this.name = name;
           }
        }catch (IllegalArgumentException ex){
           System.out.println("Name cannot to be Null or Empty");
            }
            this.age = age;
            this.weight = (double)(random.nextInt(99) + 1); // 10;
            this.date = new FeedingDate();
        }

        public Tiger build() {
            return new Tiger(this);
        }
    }
}
