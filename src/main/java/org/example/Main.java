package org.example;

public class Main {
    public static void main(String[] args) {
        ThreadImplementsRunnable obj = new ThreadImplementsRunnable();

        new Thread(obj).start();
        new ThreadExtendsThread().start();
    }
}