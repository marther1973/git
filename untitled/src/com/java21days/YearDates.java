package com.java21days;
// nieudany pomysł
class YearDates {

    public static void main(String[] arguments)
    {
        int yearIn = 2000;
        if (arguments.length > 0) {
            yearIn = Integer.parseInt(arguments[0]);
        }

        int months[] = new int[12];
        for (int i=0; i<months.length; i++) {
            months[i]=i+1;
        }
        int day[] = new int[countDays(12,yearIn )];



        for (int j=0; j<day.length; j++) {
            day[j] = j + 1;
            System.out.println(day.length);
        }
        int dates[][] = {{months.length}, {day.length}};
            for (int k = 1; k<months.length; k++)
            {
                for (int l = 1; l < countDays(12,yearIn ); l++)
                    System.out.println(l + "/" + k + "/" + yearIn);
            }
        }

        static int countDays(int month, int year) {
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