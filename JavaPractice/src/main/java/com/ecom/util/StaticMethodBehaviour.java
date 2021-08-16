package com.ecom.util;

public class StaticMethodBehaviour {
    public  static void main(String[] args){
        //FirstChallengeUtil firstChallengeUtil = new FirstChallengeUtil();
        //firstChallengeUtil.rendered();
        //FirstChallengeUtil.rendered();
        //firstChallengeUtil = new SecondChallengeUtil();
        //firstChallengeUtil.rendered();
        //SecondChallengeUtil secondChallengeUtil = new SecondChallengeUtil();
        //secondChallengeUtil.rendered();
        FirstChallengeUtil firstChallengeUtil = new FirstChallengeUtil();
        firstChallengeUtil.main(args);
        //firstChallengeUtil.main(args);
        firstChallengeUtil = new SecondChallengeUtil();
        firstChallengeUtil.main(args);
        SecondChallengeUtil secondChallengeUtil = new SecondChallengeUtil();
       // secondChallengeUtil.main(args);
        /*FirstChallengeUtil firstChallengeUtil = new FirstChallengeUtil();
        firstChallengeUtil.main(args);
        FirstChallengeUtil.main(args);
        firstChallengeUtil = new SecondChallengeUtil();
        firstChallengeUtil.main(args);
        SecondChallengeUtil secondChallengeUtil = new SecondChallengeUtil();
        secondChallengeUtil.main(args);*/
        int x = 10;
        int y = 11;
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x = " + x + " Y = " + y);

    }
}
