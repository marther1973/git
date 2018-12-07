package com.java21days;

public class Inwestycja {
    public static void main(String[] args) {
        int wartoscPoczatkowa = 14000;
        double wartoscKoncowa = ((wartoscPoczatkowa + 0.4 * wartoscPoczatkowa) - 1500 + (0.12 * wartoscPoczatkowa ));
        System.out.println("Wartość inwestycji po trzecim roku wynosi " + wartoscKoncowa + "zł.");
    }
}