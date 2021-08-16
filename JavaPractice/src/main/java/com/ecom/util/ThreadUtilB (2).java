package com.ecom.util;

public class ThreadUtilB extends Thread {
    public void run() {
        System.out.println("Thread B");
        System.out.println("i in Thread B ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("Thread B Completed.");
    }
}
