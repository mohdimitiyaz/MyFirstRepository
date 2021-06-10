package com.ecom.run;

import com.ecom.util.TaskUtil;
import com.ecom.util.ThreadUtilA;
import com.ecom.util.ThreadUtilB;
import com.ecom.util.ThreadUtilCsv1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadLifeCycle {
    public static void main(String args[]) throws Exception {
        /*ThreadUtilA thread1 = new ThreadUtilA();
        ThreadUtilB thread2 = new ThreadUtilB();
        thread1.start();
        thread1.yield();

        try {
            thread1.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        System.out.println("Main Thread End");*/
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                //System.out.println("starting expensive task thread t1");
                ThreadUtilCsv1.populateFileData(5,5,"Ahmed");
                //System.out.println("finished expensive task thread t1");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                //System.out.println("starting expensive task thread t1");
                ThreadUtilCsv1.populateFileData(2,2,"Ahmed");
                //System.out.println("finished expensive task thread t1");
            }
        });

        /* start processing on new threads */
        t2.start();

        /* block current thread until t1 has finished */
        t2.join();
    }
}



