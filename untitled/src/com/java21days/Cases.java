package com.java21days;

public class Cases {
    public static void main(String[] arguments) {
        float x = 9;
        float y = 5;
        int z = (int)(x / y);
//        System.out.println(z);
        switch (z) {
            case 1:
                x = x + 2;//x=9+2=11
            case 2:
                x = x + 3;//x=9+2+3=14
            default:
                x = x + 1;//x=9+2+3+1=15
        }
        System.out.println("Wartość x: " + x);
    }
}
