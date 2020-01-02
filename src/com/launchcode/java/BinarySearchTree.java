package com.launchcode.java;

import java.util.Calendar;
import java.util.Scanner;

public class BinarySearchTree {

    public static void checkBST() throws Exception{
        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(5);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);
        Testers.checkAddMemberCardinality(e, 5);
        Testers.checkAddMemberCardinality(n, 9);
        Testers.checkAddMemberCardinality(e, 7);
        Testers.checkAddMemberCardinality(n, 7);

        int tests = 1000;
        for (int g = 0; g < tests; g += 1){
            Tree t;
            if (g % 10 == 0){
                t = Testers.rndTree(0);
            } else {
                t = Testers.rndTree(10);
            }
            Testers.checkAddMemberCardinality(t, g);
        }
    }
    public static void checkBST2(){
        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(20);
        Testers.checkIsEmpty2(n);
        Testers.checkIsEmpty2(e);
        Testers.checkIsEmpty2(n);
        Testers.checkIsEmpty2(e);
        Testers.checkIsEmpty2(n);
        Testers.checkIsEmpty2(e);
        Testers.checkIsEmpty2(n);
        Testers.checkIsEmpty2(e);
        Testers.checkIsEmpty2(n);
        Testers.checkIsEmpty2(e);
        Testers.checkIsEmpty2(n);
        Testers.checkIsEmpty2(e);
        Testers.checkIsEmpty2(n);
        Testers.checkIsEmpty2(e);
        Testers.checkIsEmpty2(n);
        Testers.checkIsEmpty2(e);
        Testers.checkIsEmpty2(n);
        Testers.checkIsEmpty2(e);
    }



    public static void main(String[] args) throws Exception {
	// write your code here
        //checkBST();
        //checkBST2();
        //LibraryFine.libraryFine();
        //LibraryFine.anotherLibraryFine();

        /*
        * day 27 challenge; commented out 2 of the below
        * since parameters are required
        * */

        TestDataEmptyArray.get_array();         //returns 0
        TestDataUniqueValues.get_array();
        TestDataUniqueValues.arrayWithNum();
        TestDataUniqueValues.get_expected_result();
        //TestDataUniqueValues.minNumber();
        TestDataUniqueValues.random();
        TestDataExactlyTwoDifferentMinimums.get_array();
        TestDataExactlyTwoDifferentMinimums.arrayWithNum();
        TestDataExactlyTwoDifferentMinimums.get_expected_result();
        //TestDataExactlyTwoDifferentMinimums.minNumber();
        TestDataExactlyTwoDifferentMinimums.random();






    }
}
