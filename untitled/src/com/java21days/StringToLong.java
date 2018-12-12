package com.java21days;

import java.util.Scanner;

public class StringToLong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        System.out.println("wprowadź słownie nazwę liczby od jeden do dziesięć: ");
        Long count = null;

        do {
            s = in.next();
            switch (s){
                case "jeden":
                    count = 1l;
                    break;
                case "dwa":
                    count = 2l;
                    break;
                case "trzy":
                    count = 3l;
                    break;
                case "cztery":
                    count = 4l;
                    break;
                case "pięć":
                    count = 5l;
                    break;
                case "sześć":
                    count = 6l;
                    break;
                case "siedem":
                    count = 7l;
                    break;
                case "osiem":
                    count = 8l;
                    break;
                case "dziewięć":
                    count = 9l;
                    break;
                case "dziesięć":
                    count = 10l;
                    break;
                default:
                    System.out.println("To nie jest nazwa liczby od 1 do 10 !");
                    break;
                }
            } while (count == null);
        System.out.println(count);
    }
}
