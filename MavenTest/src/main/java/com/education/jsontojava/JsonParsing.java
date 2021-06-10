package com.education.jsontojava;

import com.education.dto.Order;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonParsing {

    /* private String brand = null;
     private int doors = 0;

     public String getBrand() { return this.brand; }
     //public void   setBrand(String brand){ this.brand = brand;}

     public int  getDoors() { return this.doors; }
     //public void setDoors (int doors) { this.doors = doors; }
     public static void main(String args[]) throws  Exception{
         ObjectMapper objectMapper = new ObjectMapper();
         Test example = objectMapper.readValue(new File("example.json"), Test.class);

         String carJson =
                 "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

         try {
             Test car = objectMapper.readValue(carJson, Test.class);

             System.out.println("car brand = " + car.getBrand());
             System.out.println("car doors = " + car.getDoors());
         } catch (IOException e) {
             e.printStackTrace();
         }
     }*/
    public static void main(String args[]) throws Exception {
        //ObjectMapper objectMapper = new ObjectMapper();

        // InputStream input = new FileInputStream("C:\\Users\\Imtiyaz\\Downloads\\BxGy-SinglePG-twoLookUps-Dollars.json");

        //Test test = objectMapper.readValue(input, Test.class);
        /*try {
            //Test test = objectMapper.readValue(input, Test.class);
            ObjectMapper objectMapper = new ObjectMapper();
            Order order = objectMapper.readValue(new File("C:\\Users\\Imtiyaz\\Downloads\\BxGy-SinglePG-twoLookUps-Dollars.json"), Order.class);
            //Test book = objectMapper.readValue(Paths.get("C:\\Users\\Imtiyaz\\Downloads\\BxGy-SinglePG-twoLookUps-Dollars.json").toFile(), Test.class);
            // print book
            for(OrderTender tender:order.getTenders()) {

                System.out.println(tender);
            }
            *//*System.out.println("Or brand = " + );
            System.out.println("car doors = " + car.getDoors());*//*
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/


        ObjectMapper mapper = new ObjectMapper();


        /**
         * Read object from file
         */

        File file = new File("C:\\Users\\Imtiyaz\\Downloads\\BxGy-SinglePG-twoLookUps-Dollars.json");
        Order value = null;
        try {
            value = mapper.readValue(file, Order.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(value);

    }

}






