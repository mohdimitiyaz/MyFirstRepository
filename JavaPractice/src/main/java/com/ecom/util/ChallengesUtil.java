package com.ecom.util;

public class ChallengesUtil {

    public static Long  getDurationString(Long minutes,Long seconds){
        if(minutes < 0 || seconds < 0 || seconds >60){
            return -1L;
        }
        else{

            Long hours = (minutes*60L + seconds * 3600L);
            System.out.println(hours + "hrs" + hours%60 + "mins" + hours%3600 + "secs" );
            return hours;
        }
    }
}
