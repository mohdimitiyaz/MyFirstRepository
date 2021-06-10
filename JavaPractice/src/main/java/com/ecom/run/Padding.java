package com.ecom.run;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.ecom.util.CommonUtil.handlePadding;

public class Padding {

    public static void main(String args[]) {
        //populating data
        List<String> stringList = new ArrayList<>();
        stringList.add("Car");
        stringList.add("Four");
        stringList.add("Truth");
        stringList.add("abcdef");

        int maxLength = 14;

        // implementing the logic
        /*List<String> stringList1 = handlePadding(stringList, maxLength);
        // Asserting the result
        for (String input : stringList1) {
            System.out.println("String Length is " + input.length());*/
        List<String> stringList1 = handlePadding(stringList, maxLength);
        // Asserting the result
        stringList1.forEach(input->System.out.println("String Length is " + input));
    }

    public static List<String> handlePaddingOld(List<String> listOfString, int maxlength) {
        /*for (String string : listOfString) {
            StringBuilder sb = new StringBuilder();
            while (sb.length() < length - string.length()) {
                sb.append('0');
            }
            sb.append(string);

            string = sb.toString();
            System.out.println(string);
        }*/
        for(int i=0; i<listOfString.size();i++){

           String string=listOfString.get(i);
            StringBuilder sb = new StringBuilder();
            while (sb.length() < maxlength - string.length()) {
                sb.append('0');
            }
            sb.append(string);
            string = sb.toString();
            listOfString.set(i, string);
            System.out.println(string);
        }
        return listOfString;

    }

}