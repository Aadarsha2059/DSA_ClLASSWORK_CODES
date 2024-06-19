package org.example;

public class ThreadExample extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Example started");
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("executing task1 job"+i);
        }
        ThreadExample t1 = new ThreadExample();
        t1.start();
        System.out.println("app finished");
    }
}
