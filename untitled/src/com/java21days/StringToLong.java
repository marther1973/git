package com.java21days;

import java.util.Scanner;

public class StringToLong {

    public static void main(String[] args) {

        long count;
        do {
            System.out.println("wprowadź słownie nazwę liczby od jeden do dziesięć: ");
            Scanner in = new Scanner(System.in);
            String s = in.next();
            count = 1;
            switch (s){
                case "jeden":
                    count = 1;
                    System.out.println(count);
                    break;
                case "dwa":
                    count = 2;
                    System.out.println(count);
                    break;
                case "trzy":
                    count = 3;
                    System.out.println(count);
                    break;
                case "cztery":
                    count = 4;
                    System.out.println(count);
                    break;
                case "pięć":
                    count = 5;
                    System.out.println(count);
                    break;
                case "sześć":
                    count = 6;
                    System.out.println(count);
                    break;
                case "siedem":
                    count = 7;
                    System.out.println(count);
                    break;
                case "osiem":
                    count = 8;
                    System.out.println(count);
                    break;
                case "dziewięć":
                    System.out.println(count);
                    count = 9;
                    break;
                case "dziesięć":
                    System.out.println(count);
                    count = 10;
                    break;
                default:
                    System.out.println("To nie jest nazwa liczby od 1 do 10 !");
                    break;
                }
            } while (count < 11);
    }

}
