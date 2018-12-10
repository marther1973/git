package com.java21days;

public class DateFormat {
    public static void main(String[] args) {
        String d = new String("29042016");
        System.out.println("date is: "
                + d.substring(0,2) + "\n"
                + d.substring(2,4) + "\n"
                + d.substring(4,8)
        );
    }
}



