// Generator.java
//
//import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
//import org.jetbrains.annotations.Nullable;
//
//import java.io.PrintWriter;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;

import java.io.FileWriter;
import java.util.Random;

public class Generator41Mariusz<gName> {

    private final static String smallLetters = "qwertyuiopasdfghjklzxcvbnm";
    private final static String bigLetters = smallLetters.toUpperCase();
    private final static String specialSigns = "!@#$%^&*()_+?<>";
    private final static String numbers = "1234567890";

    public static void main(String[] args) {
        System.out.println("Test gNumber " + gNumber(9));
        System.out.println("Test gNumberRange " + gNumberRange(10, 20));
        System.out.println("Test gDate " + gDate(1990, 2010));
        System.out.println("Test gString " + gString(5));
        System.out.println("Test gPasswd " + gPasswd(10));
        System.out.println("Test gEmail " + gEmail(6));
        System.out.println("Test gName " + gName(Name.Female));
        System.out.println("Test gLastName " + gLastName(LastName.Female));
    }

    public static String gNumber(int length) {
        String number = "";
        for (int i = 0; i < length; i++) {
            number += new Random().nextInt(17);
        }
        return number;
    }

    public static int gNumberRange(int from, int to) {
        return new Random().nextInt(to - from + 1) + from;
    }

    public static String gDate(int yearFrom, int yearTo) {
        int day = gNumberRange(1, 28);
        int month = gNumberRange(1, 12);
        int year = gNumberRange(yearFrom, yearTo);
        String dayS = Integer.toString(day);
        String monthS = Integer.toString(month);

        if( day < 10) {
            dayS = "0" + Integer.toString(day);
        }

        if(month < 10) {
            monthS = "0" + Integer.toString(month);
        }

        return String.format("%d-%s-%s", year, monthS, dayS);
    }

    public static String gString(int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += smallLetters.charAt(gNumberRange(0, smallLetters.length()-1));
        }
        return result;
    }

    public static String gPasswd(int length) {
        String result = "";
        String allStrings = smallLetters + bigLetters + specialSigns + numbers;
        for (int i = 0; i < length; i++) {
            result += allStrings.charAt(gNumberRange(0, allStrings.length()-1));
        }
        return result;
    }

    public static String gEmail(int length) {
        String result = "";
        String twoString = smallLetters + numbers;
        String[] host = {"gmail.com", "o2.pl", "mail.ru", "yahoo.com", "wp.pl"};
        for (int i = 0; i < length; i++) {
            result += twoString.charAt(gNumberRange(0, twoString.length()-1));
        }
        return String.format("%s@%s", result, host[gNumberRange(0, host.length-1)]);
    }



    public static String gName(Name g) {
        if(g == Name.Male) {
            return Name.Male.getName();
        } else if(g == Name.Female) {
            return Name.Female.getName();
        }
        return null;
    }




    public static String gLastName(LastName g) {
        if(g == LastName.Male) {
            return LastName.Male.getLastName();
        } else if(g == LastName.Female) {
            return LastName.Female.getLastName();
        }
        else if(g == LastName.Unisex) {
            return LastName.Unisex.getLastName();
        }
        return null;


    }

//    public static void FileCSVWriter(String[] args) {
//
//        String filePath = "D:\\data.csv";
//        int number = 1234567;
//        FileWriter fileWriter = null;
//
//        try {
//            fileWriter = new FileWriter(filePath);
//            fileWriter.write(Integer.toString(number));
//        } finally {
//            if (fileWriter != null) {
//                fileWriter.close();
            }
//        }
//    }

//}