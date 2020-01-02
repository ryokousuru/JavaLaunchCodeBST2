package com.launchcode.java;

import java.util.Calendar;
import java.util.Scanner;

public class LibraryFine {

    public static void libraryFine(){
        Scanner into = new Scanner(System.in);
        System.out.println("Enter the date the book was actually returned.");
        System.out.println("Please use the format DD MM YYYY");
        System.out.println("For example, February 9, 2004 would be 02 09 2004");
        int actD = into.nextInt();
        int actM = into.nextInt();
        int actY = into.nextInt();

        System.out.println("Same format, now enter the due date, please");

        int dueD = into.nextInt();
        int dueM = into.nextInt();
        int dueY = into.nextInt();

        into.close();

        Calendar actCal = Calendar.getInstance();
        Calendar dueCal = Calendar.getInstance();

        actCal.set(actY, actM - 1, actD);
        dueCal.set(dueY, dueM - 1, dueD);

        if (actCal.getTimeInMillis() <= dueCal.getTimeInMillis()){
            System.out.println("The fine is 0");
        } else {
            if (actY > dueY){
                System.out.println("The fine is " + 10000);
            } else {
                if (actM > dueM){
                    int monthDiff = actM - dueM;

                    System.out.println("The fine is " + 500 * monthDiff);
                } else {
                    int dayDiff =   actD - dueD;
                    System.out.println("The fine is " + 15 * dayDiff);
                }
            }
        }
    }
    public static void anotherLibraryFine(){
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the day the book was returned.");
        System.out.println("Please enter it in the format DD MM YYYY.");
        System.out.println("For example, April 17, 2015 would be 17 04 2015.");
        int rD = enter.nextInt();
        int rM = enter.nextInt();
        int rY = enter.nextInt();
        System.out.println("Please use the same format to enter the due date.");
        int dD = enter.nextInt();
        int dM = enter.nextInt();
        int dY = enter.nextInt();

        int fine = 0;
        if (rY > dY){
            fine = 10000;
        } else if (rY == dY){
            if (rM > dM){
                fine = 500 * (rM - dM);
            } else if (rM == dM){
                if (rD > dD){
                    fine = 15 * (rD - dD);
                }
            }
            System.out.println("The fine is " + fine);
        }
    }
}
