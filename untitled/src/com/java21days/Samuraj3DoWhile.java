package com.java21days;

public class Samuraj3DoWhile {
    public static void main(String[] args) {
        int tab[] = new int[7];
            tab[0] = 6;
            tab[1] = 9;
            tab[2] = 2;
            tab[3] = 6;
            tab[4] = 4;

        int n = 10;
        while (n>0)
        {
            System.out.println("cokolwiek" + n);
            n--;
        }


            do {
                System.out.println("cokolwiek ");
                n++;
            }
            while (n < 5);
            {
                System.out.println("koniec ");
            }
    }

}
