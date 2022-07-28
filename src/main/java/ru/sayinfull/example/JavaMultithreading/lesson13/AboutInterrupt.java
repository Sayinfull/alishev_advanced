package ru.sayinfull.example.JavaMultithreading.lesson13;

import java.util.Map;
import java.util.Random;

public class AboutInterrupt {
    public static void main(String[] args) throws InterruptedException {


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1000_000_000; i++) {
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Thread was interupted");
                        break;
                    }
                    Math.sin(random.nextDouble());
                }
            }
        });

        System.out.println("Thread is started");

        thread.start();

        Thread.sleep(1000);
        thread.interrupt();

        thread.join();

        System.out.println("Thread has finished");
    }
}
