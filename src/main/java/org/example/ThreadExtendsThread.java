package org.example;

public class ThreadExtendsThread extends Thread {

    @Override
    public void run() {
        System.out.println("Extends Thread");
    }
}
