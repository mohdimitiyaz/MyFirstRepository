package com.ecom.util;

import com.ecom.dto.Order;

import java.util.*;

public class OrderComparator implements Comparator<Order> {

    @Override
    public int compare(Order order1, Order order2) {
        //int comparedLoanAmount = order1.getEndDate().compareTo(order2.getEndDate());
        int result = 0;
        if (order1.getEndDate() == null) {
            result = +1;

        } else if (order2.getEndDate() == null) {
            result=-1;
        } else {
            int result1=0;
            result = order1.getEndDate().compareTo(order2.getEndDate());

            if (order1.getStartDate() == null ) {
                result1=-1;
            }else if (order2.getStartDate()==null){
                result1=+1;
             }
            else {
                result1 = order1.getStartDate().compareTo(order2.getStartDate());

            }
            return result1;
            }

        return result;
        }

    }






            /*else{
                return  result;
           }*/


