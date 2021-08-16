package com.ecom.util;

public class SampleUtil {

    public static long toMilesPerHour(double kiloMetersPerHour) {
        if (kiloMetersPerHour < 0) {
            return -1;
        } else {
            long milesPerHour = (long) (kiloMetersPerHour / 1.609);
            return milesPerHour;
        }
    }

    public static long  printConversion(double kiloMetersPerHour) {
        long roundedOffTheNumber = 0;
        if (kiloMetersPerHour < 0) {
            System.out.println("it is an invalid value ");
        } else {
            long convertedToMph = toMilesPerHour(kiloMetersPerHour);
            roundedOffTheNumber = Math.round(convertedToMph);
            System.out.println(kiloMetersPerHour + " Km/h = " + roundedOffTheNumber + " mph ");
        }
        return roundedOffTheNumber;


    }

}
