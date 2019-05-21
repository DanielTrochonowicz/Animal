package Animal;

import java.util.concurrent.TimeUnit;

public class LionThread extends Thread {

    public void run(){

        while (true){
            System.out.println("I am Lion, I am making Lrrr sound");
            try {
                TimeUnit.SECONDS.sleep(30);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

