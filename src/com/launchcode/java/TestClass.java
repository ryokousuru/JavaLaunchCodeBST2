package com.launchcode.java;

public class TestClass {
    public static int minimum_index(int[] seq){
        if (seq.length == 0){
            throw new IllegalArgumentException("Can't get the minimum value index from an empty sequence.");
        }
        int min_idx = 0;
        for (int a = 1; a < seq.length; a += 1){
            if(seq[a] < seq[min_idx]){
                min_idx = a;
            }
        }
        return min_idx;
    }
}
