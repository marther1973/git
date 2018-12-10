package com.java21days;

public class Samuraj3ForEach {

    public static void main(String[] args)
    {
        int tab[] = new int[7];
        tab[0] = 6;
        tab[1] = 9;
        tab[2] = 2;
        tab[3] = 6;
        tab[4] = 4;
        for(int i : tab)
        {
            System.out.println("Element tablicy = " + i);
        }
    }
}
