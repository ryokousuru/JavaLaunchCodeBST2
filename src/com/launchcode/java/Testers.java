package com.launchcode.java;

import java.util.Random;

public class Testers {

    //random integers

    public static int randomInt (int min, int max){
        Random rd = new Random();
        return rd.nextInt(max-min + 1) + min;
        /*
        * min = 5; max = 15
        * 15 - 5 = 10 + 1 = 11 --> 0 to 10
        * + 5 to this random number
        * */
    }
    //random binary search trees

    public static Tree rndTree(int count){ //count determines size of BST
        if (count == 0){
            return new EmptyBST();
        } else {
            return rndTree(count - 1).add(randomInt(0, 50));
        }
    }


    public static void checkIsEmpty(Tree t)throws Exception {
        /* using exception, user is only notified if there's a problem
        * if the tree t is an instance of EmptyBST --> t.isEmpty --> true
        *  if the tree t is an instance of NonEmptyBST --> t.isEmpty --> false
         */

        if (t instanceof EmptyBST){
            if (!t.isEmpty()){
                throw new Exception("All is not well; the tree is an EmptyBST and it's non-empty.");
            }

        }else if (t instanceof NonEmptyBST){
            if (t.isEmpty()){
                throw new Exception("All is not good, the tree is a NonEmptyBST and it's empty.");
            }
        }
    }
    public static void checkIsEmpty2(Tree t){
        //if the tree t is an instance of EmptyBST --> t.isEmpty --> true
        //if the tree t is an instance of NonEmptyBST --> t.isEmpty --> false
        if (t instanceof EmptyBST){
            if (t.isEmpty()){
                System.out.println("All is well.");
                System.out.println("The tree is an EmptyBST and and it's empty.");
            }
        }else if (t instanceof NonEmptyBST){
            if (!t.isEmpty()){
                System.out.println("All is well.");
                System.out.println("The tree is a NonEmpty BST and it's non-empty.");
            }
        }
    }
    public static void checkAddMemberCardinality(Tree t, int x) throws Exception {
        int nT = (t.add(x)).cardinality();
        //case 1 - something was added -> and cardinality was increased by one
        if (nT == t.cardinality() + 1){
            if (t.member(x)){
                throw new Exception("The cardinality increased by 1, but the added" +
                        "item was already a member of the tree.");
            } else {
     //           System.out.println("All is well. The cardinality increased and" +
       //                 " the item wasn't in the tree.");
            }
            //case 2 - nothing was added since item to be added was already there
        } else if (nT == t.cardinality()){
            if (t.member(x)){
        //        throw new Exception("The cardinality didn't increase by one, but " +
        //                "one thing was added.");
            } else {
                System.out.println("All is well, the item was in the tree already and" +
                        " the cardinality didn't increase.");
            }
        } else {
            throw new Exception("Something is wrong with the program.");
        }
    }
}
