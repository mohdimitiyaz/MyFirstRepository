package com.ecom.run;

import com.ecom.dao.InterfaceUseCase;
import com.ecom.util.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

@SpringBootApplication
public class StarPattern  {

    /*public static boolean areEqualUptoThreeDecimal(double firstDecimalprm,double secondDecimalprm){
        double changePrm1 = firstDecimalprm*1000;
        double changePrm2 = secondDecimalprm*1000;
        int changedIntoIntFirst = (int)changePrm1;
        int changedIntoIntSecond = (int)changePrm2;
        double resultantprm = changedIntoIntFirst - changedIntoIntSecond;

        if(resultantprm == 0){
            System.out.println("passed");
            return true;

        }
        else{
            System.out.println("failed");
            return false;
        }
    }*/
    /*public static boolean hasEqualSum(int a,int b,int c){
        if(a+b==c){
            System.out.println("passed");
            return true;
        }
        else
        {
            System.out.println("failed");
            return false;
        }
    }*/
    public static boolean hasTeen(int a,int b,int c){
        if(a>=13 && a<=19){
            System.out.println("passed");
            return true;
        }
        else if(b>=13 && b<=19){
            System.out.println("passed");
            return true;
        }
        else if(c>=13 && c<=19){
            System.out.println("passed");
            return true;
        }
        else{
            System.out.println("failed");
            return false;
        }
    }


    public static void main(String args[]) {
        hasTeen(9,99,19);
        //areEqualUptoThreeDecimal(-3.1756,-3.175);
        //InterfaceUseCase.map.put("Imtiyqz","10");
        //InterfaceUseCase.map.put("Imtiyaz","20");
        //InterfaceUseCase.map.put("ahmed","22");
        //InterfaceUseCase.map1 = neHashMap<>();
        //System.out.println(InterfaceUseCase.map);
        //  FirstChallengeUtil.isLeapYear(2000);
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BeanConfiguration.class);
        context.refresh();
        DeleteUtil myFirstBean = context.getBean(DeleteUtil.class);
        System.out.println(myFirstBean.hashCode());
       DeleteUtil mySecondBean = context.getBean(DeleteUtil.class);
        System.out.println(mySecondBean.hashCode());
        context.close();*/
         /* PracticeUtil practiceUtil =new PracticeUtil();
        practiceUtil.setFirstName("Imtiyaz");
        practiceUtil.setLastName("Ahmed");
        practiceUtil.setAge(29.5d);
        *//*System.out.println("My First Name is : " +practiceUtil.getFirstName() + "My Last Name is : " +practiceUtil.getLastName());
        System.out.println("My age is : " +practiceUtil.getAge());
        *//*
        SingleTonUtil singleTonUtil = SingleTonUtil.getInstance();
        singleTonUtil.sampleSingleTon();
        */
       /* int n=4;
for (int i=0;  i<n;i++){
    for(int j=0;j<i;j++){
        System.out.print("*");

    }
    System.out.println("\n");
}*/
       /* String myString = "this is my String";
        System.out.println("my String is equal " +myString);
        myString = myString + ", this is more";
        System.out.println("my String is equal , " +myString);
        myString = myString + "\u00A9";
        System.out.println("myString is equal to " +myString);
        String numberString = "250.55";
        numberString = numberString+ "45.99";
        System.out.println(numberString);
        String myNewString = "10";
        int myInt = 222;
        myNewString = myNewString + myInt;
        System.out.println("My New String " + myNewString);
        double myDouble = 127.6d;
        myNewString = myNewString + myDouble;
        System.out.println("My New String is equal to " + myNewString);*/
      /* int result = 1+2;
        System.out.println("1+2 = " +result);
        int previousResult = result;
        System.out.println("previousResult = " +previousResult);
        result = result - 1;
        System.out.println("result - 1 = " +result);
        result = result*10;
        System.out.println("result*10 = " +result);
        result = result/5;
        System.out.println("result/5 = " +result);
        result = result%3;
        System.out.println("result%3 = " +result);
        result++;
        System.out.println("1+1 = " +result);
        result--;
        System.out.println("2-1 = " +result);
        result *=10;
        System.out.println("result*10 = " +result);
        result /=2;
        System.out.println("result/2 = " +result);
        result -=2;
        System.out.println("result-2 = " +result);*/
       /*  boolean isImtiyaz = false;
         if(isImtiyaz == false) {
          System.out.println("this is imtiyaz");
          System.out.println("this is a senior java developer");
         }*/
        //int initialScore = 80;
         /*if(initialScore <= 100){
          System.out.println("this condition has satisfied");
         }*/
        /* int finalValue = 81;
         if((initialScore>finalValue) || (finalValue<100)){
          System.out.println("this condition has satisfied");
         }*/
      /*  double istDOubleValue = 20.00;
        double secondDoubleValue = 80.00;
        double resultInDoubleValue = (istDOubleValue + secondDoubleValue) * 100.00;
        double remainderOperator = resultInDoubleValue % 40.00d;
        boolean myBoleanValue = remainderOperator == 0 ? true : false;
        System.out.println(myBoleanValue);
        if (myBoleanValue == false) {
            System.out.println("got some remainder");
        }*/

        //SampleUtil sampleUtil = new SampleUtil()

    }
}

