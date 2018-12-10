package com.java21days;

public class Dates {

    public static void main(String[] arguments) {
        int yearIn = 2016;
        if (arguments.length > 0)
            yearIn = Integer.parseInt(arguments[0]);
        int months[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//styczeń
        int days1 = 1 + countDays(1, yearIn);
        for (int i = 1; i < days1; i++) {
            System.out.println("" + i + "/" + months[0] + "/" + yearIn + ", ");
        }
//luty
        int days2 = 1 + countDays(2, yearIn);
        for (int i = 1; i < days2; i++) {
            System.out.println("" + i + "/" + months[1] + "/" + yearIn + ", ");
        }
//marzec
        int days3 = 1 + countDays(3, yearIn);
        for (int i = 1; i < days3; i++) {
            System.out.println("" + i + "/" + months[2] + "/" + yearIn + ", ");
        }
//kwiecień
        int days4 = 1 + countDays(4, yearIn);
        for (int i = 1; i < days4; i++) {
            System.out.println("" + i + "/" + months[3] + "/" + yearIn + ", ");
        }
//maj
        int days5 = 1 + countDays(5, yearIn);
        for (int i = 1; i < days5; i++) {
            System.out.println("" + i + "/" + months[4] + "/" + yearIn + ", ");
        }
//czerwiec
        int days6 = 1 + countDays(6, yearIn);
        for (int i = 1; i < days6; i++) {
            System.out.println("" + i + "/" + months[5] + "/" + yearIn + ", ");
        }
//lipiec
        int days7 = 1 + countDays(7, yearIn);
        for (int i = 1; i < days7; i++) {
            System.out.println("" + i + "/" + months[6] + "/" + yearIn + ", ");
        }
//sierpień
        int days8 = 1 + countDays(8, yearIn);
        for (int i = 1; i < days8; i++) {
            System.out.println("" + i + "/" + months[7] + "/" + yearIn + ", ");
        }
//wrzesień
        int days9 = 1 + countDays(9, yearIn);
        for (int i = 1; i < days9; i++) {
            System.out.println("" + i + "/" + months[8] + "/" + yearIn + ", ");
        }
//październik
        int days10= 1 + countDays(10, yearIn);
        for (int i = 1; i < days10; i++) {
            System.out.println("" + i + "/" + months[9] + "/" + yearIn + ", ");
        }
//listopad
        int days11= 1 + countDays(11, yearIn);
        for (int i = 1; i < days11; i++) {
            System.out.println("" + i + "/" + months[10] + "/" + yearIn + ", ");
        }
//grudzień
        int days12= 1 + countDays(12, yearIn);
        for (int i = 1; i < days12; i++) {
            System.out.println("" + i + "/" + months[11] + "/" + yearIn + ", ");
        }
    }
                 static int countDays ( int month, int year){
                int count = -1;
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        count = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        count = 30;
                        break;
                    case 2:
                        if (year % 4 == 0)
                            count = 29;
                        else
                            count = 28;
                        if ((year % 100 == 0) & (year % 400 != 0))
                            count = 28;
                }
                return count;
            }
}
