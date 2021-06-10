package com.ecom.run;

import com.ecom.dto.Shipment;
import com.ecom.dto.Student;
import com.ecom.util.CSVUtil;
import com.ecom.util.OrderUtil;
import com.ecom.util.ThreadUtilCsv1;
import com.ecom.util.ThreadUtilCsv2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class StudentMain {
    public static void main(String args[]) throws Exception {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        ThreadUtilCsv1 threadUtilCsv1 = new ThreadUtilCsv1(5000);
        ThreadUtilCsv2 threadUtilCsv2 = new ThreadUtilCsv2(1000);
        executor.execute(threadUtilCsv1);
        executor.execute(threadUtilCsv2);
        while (executor.getTaskCount() != executor.getCompletedTaskCount()) {
            System.err.println("count= " + executor.getTaskCount() + ", CompletedCount= " + executor.getCompletedTaskCount());
            Thread.sleep(2000);
        }
        System.err.println("After While loop count= " + executor.getTaskCount() + ", CompletedCount= " + executor.getCompletedTaskCount());
        executor.shutdown();


    }
}