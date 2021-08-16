package com.education.jsontojava;

import com.education.dto.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String args[]) {

        /*System.out.println("This is done with the help of failfast");
        List<Integer> failFast = new CopyOnWriteArrayList<>();
        failFast.add(6);
        failFast.add(7);
        failFast.add(8);
        failFast.add(9);
        failFast.add(10);
        Iterator<Integer> itr = failFast.listIterator();
        while (itr.hasNext()) {
            Integer integer = itr.next();
            failFast.remove(integer);
            System.out.println(failFast);
        }*/
        System.out.println("This is done with the help of failSafe");
        List<Integer> failSafe = new ArrayList<>();
        failSafe.add(1);
        failSafe.add(2);
        failSafe.add(3);
        failSafe.add(4);
        failSafe.add(5);
        //List<Order> cityOrders = new ArrayList<>();
        Iterator<Integer> iterator = failSafe.iterator();
        try {
            while (iterator.hasNext()) {
                Integer integer = iterator.next();
                failSafe.remove(integer);
                System.out.println(failSafe);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
