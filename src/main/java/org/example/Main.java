package org.example;

public class Main {
    public static void main(String[] args) {
        ThreadImplementsRunnable obj = new ThreadImplementsRunnable();
        Thread thread2 = new Thread(obj);
        ThreadExtendsThread thread1 = new ThreadExtendsThread();

        thread1.setPriority(10);
        thread1.setName("I am thread no1");
        thread2.setPriority(1);
        thread2.setName("I am thread no2");

        thread1.start();
        thread2.start();
    }
}