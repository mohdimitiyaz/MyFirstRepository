package com.ecom.util;

public class SingleUtil {

    private static SingleUtil singleUtil = new SingleUtil();

    private SingleUtil(){

    }

    public static SingleUtil getSingleUtil() {
        return singleUtil;
    }
    public  static void prototypeMethod(){
        System.out.println("this is the prototype method of singleton class");
    }
}
