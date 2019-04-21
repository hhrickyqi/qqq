package com.practice.tools;

import java.text.DecimalFormat;

public class DecimalFormatUtils {
    public static String getDcimalFormatForOneInt(double d){
        DecimalFormat df = new DecimalFormat("0");
        return df.format(d);
    }
    public static String getDcimalFormatForTwoDouble(double d){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(d);
    }
    public static String getDcimalFormatForFourDouble(double d){
        DecimalFormat df = new DecimalFormat("0.0000");
        return df.format(d);
    }
    public static String getDcimalFormatForInt(double d){
        DecimalFormat df = new DecimalFormat("#");
        return df.format(d);
    }
    public static String getDcimalFormatForPercent(double d){
        DecimalFormat df = new DecimalFormat("#.##%");
        return df.format(d);
    }
}
