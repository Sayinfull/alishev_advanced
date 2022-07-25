package ru.sayinfull.example.JavaMultithreading.lesson1;

public class AboutMultithreading {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Hello world!");
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread1 = new MyThread();
//        myThread1.start();
    Thread thread = new Thread(new Runner());
    thread.start();

    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}
