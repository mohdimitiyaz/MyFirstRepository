package com.ecom.util;

public class SingleTonUtil {
    private static SingleTonUtil singleTonUtil = null;
    private SingleTonUtil(){

    }
    public static SingleTonUtil getInstance(){
        if(singleTonUtil == null){
            singleTonUtil = new SingleTonUtil();

        }
        return singleTonUtil;
    }

    public static void sampleSingleTon(){
        System.out.println("this is just an sample code of singleton design pattern");
    }



}
