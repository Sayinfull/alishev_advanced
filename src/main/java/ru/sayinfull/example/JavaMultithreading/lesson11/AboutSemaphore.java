package ru.sayinfull.example.JavaMultithreading.lesson11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class AboutSemaphore {
    public static void main(String[] args) throws InterruptedException {
//        Semaphore semaphore = new Semaphore(3);
//        semaphore.release(); //этот метод отпускает разрешение. Вызываем когда заканчиваем использовать ресурс
//        try {
//            semaphore.acquire(); //вызываем когда взаимодействуем с ресурсом
//            semaphore.acquire();
//            semaphore.acquire();
//            System.out.println("All permits have been acquired");
//            semaphore.acquire();
//            System.out.println("Can't be reach here...");
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        semaphore.availablePermits();// показывает количество доступных разрешений


        ExecutorService executorService = Executors.newFixedThreadPool(200);

        Connection connection = Connection.getConnection();
        for (int i = 0; i < 200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}
//singleton
class Connection{
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);


    private Connection(){

    }

    public static Connection getConnection(){
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }

    public void doWork() throws InterruptedException {
        synchronized (this){
            connectionsCount++;
            System.out.println(connectionsCount);
        }
        Thread.sleep(5000);
        synchronized (this){
            connectionsCount--;

        }
    }
}
