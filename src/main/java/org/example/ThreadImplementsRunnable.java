package org.example;

import static java.lang.Thread.currentThread;

public class ThreadImplementsRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(currentThread().getName());
    }
}
