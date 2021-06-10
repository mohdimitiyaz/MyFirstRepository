package com.education.jsontojava;

import java.util.*;
import java.util.stream.Collectors;

public class RetrieveKeysValues {
    public static void main(String args[]) {

        Map<String, Double> productPrice = new HashMap<>();
        productPrice.put("Rice", 6.9);
        productPrice.put("Flour", 3.9);
        productPrice.put("Sugar", 4.9);
        productPrice.put("Milk", 3.9);
        productPrice.put("Egg", 1.9);
        //System.out.println("List Of Keys");
        /*Set<String> keys = productPrice.keySet();
        keys.forEach(key -> System.out.println(key));
        System.out.println("Collection Of Values");
        Collection<Double> values = productPrice.values();
        values.forEach(value -> System.out.println(value));
        System.out.println("Collection Of both Key Value Pairs");
        Set<Map.Entry<String, Double>> entries = productPrice.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.print("key: "+ entry.getKey());
            System.out.println(", Value: "+ entry.getValue());
        }
        System.out.println("Iteration through Java 8");
        productPrice.forEach((key, value) -> {
            System.out.print("key: "+ key);
            System.out.println(", Value: "+ value);
        });*/
        final Map<String, Double> sortedByCount = productPrice.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedByCount);
        System.out.println("Sorting By Key");
        final Map<String, Double> sortedByKey = productPrice.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedByKey);


    }

}
