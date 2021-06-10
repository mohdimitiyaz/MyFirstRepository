package com.ecom.util;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommonUtil {

    public static List<String> handlePadding(List<String> listOfString, int maxLength) {
        /*for (String string : listOfString) {
            StringBuilder sb = new StringBuilder();
            while (sb.length() < length - string.length()) {
                sb.append('0');
            }
            sb.append(string);

            string = sb.toString();
            System.out.println(string);
        }*/
       /* for (int i = 0; i < listOfString.size(); i++) {

            String strToPad = listOfString.get(i);// car
            //StringBuilder sb = new StringBuilder();// sb = ""
            String paddedStr =handlePadding(strToPad,maxLength);
            //strToPad = sb.toString();// ""
            listOfString.set(i, paddedStr);
            System.out.println(paddedStr);

         // listOfString.add(ss);

        }

        arr1
            .stream()
            .forEach(s -> {
                System.out.print(s);
            });

        return listOfString;*/
        /*listOfString.forEach(paddedStr -> {

            handlePadding(paddedStr,maxLength);
        });*/
        /*listOfString.stream()
                .map(paddedStr ->

                    handlePadding(paddedStr,maxLength)
                 )
                //.filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("processed list, only even numbers: " + paddedStr);*/

       /* listOfString.stream()
                .flatMap(paddedStr -> handlePadding(paddedStr, maxLength).length())
                .collect(Collectors.toList());*/

        //
        List<String>  paddedlistofString = listOfString.stream()
                .map(paddedStr -> {
                            String resultStr = handlePadding(paddedStr, maxLength);
                            System.out.println("Inside Map Method Result " + resultStr);
                            return resultStr;
                        }
                ).collect(Collectors.toList());

        List<String>  list2 = listOfString.stream()
                .map(padStr -> padFn.apply(padStr, maxLength))//000000Car
                .map(String::toUpperCase)// method reference..
                .collect(Collectors.toList());
        /*listOfString
                .stream()
                .forEach(paddedStr ->
                    handlePadding(paddedStr, maxLength).collect(Collectors.toList())*/


        //StringBuilder sb = new StringBuilder();// sb = ""
        //String paddedStr =handlePadding(strToPad,maxLength);

        //listOfString.set(i, paddedStr);
        //System.out.println(paddedStr);

        // listOfString.add(ss);5


        return paddedlistofString;
    }

    static BiFunction<String, Integer,  String> padFn = (input, maxLength )-> {
        String result = handlePadding(input, maxLength);
        return result;
    };


    public static String handlePadding(String stringName, int maxLength) {

        StringBuilder sb = new StringBuilder();
        while (sb.length() < maxLength - stringName.length()) {
            sb.append('0');
        }
        sb.append(stringName);
        stringName = sb.toString();
        // listOfString.set(i, string);
        //System.out.println(stringName);
        return stringName;
    }

}

