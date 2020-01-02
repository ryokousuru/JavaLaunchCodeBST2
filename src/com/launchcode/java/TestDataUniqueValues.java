package com.launchcode.java;

import java.util.Arrays;

public class TestDataUniqueValues {
    public static int[] get_array(){
        int[] array = arrayWithNum();
        //verify elements are unique
        for(int a = 0; a < array.length; a += 1){
            for(int b = a + 1; b < array.length; b += 1){
                if (array[a] == array[b]){get_array();}
            }
        }
        return array;
    }
    //create an array with random numbers
    public static int[] arrayWithNum(){
        int[] array = new int[3];
        for (int c = 0; c < array.length; c += 1){
            array[c] = random();
        }
        //sort array for proper answer
        Arrays.sort(array);
        return array;
    }
    //random numbers
    public static int random(){
        int random = (int)(Math.random() * 100) + 1;
        return random;
    }
    public static int get_expected_result(){
        int[] array = get_array();
        int minValue = minNumber(array);
        return minValue;
    }
    public static int minNumber(int[] array){
        //to get the minimum index of an array
        int min_idx = 0;
        for(int e = 0; e < array.length; e += 1){
            if (array[e] < array[min_idx]){
                min_idx = e;
            }
        }
        return min_idx;
    }
}
