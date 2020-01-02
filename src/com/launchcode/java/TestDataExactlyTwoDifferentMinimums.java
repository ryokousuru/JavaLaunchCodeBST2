package com.launchcode.java;

import static com.launchcode.java.TestDataUniqueValues.arrayWithNum;
import static com.launchcode.java.TestDataUniqueValues.minNumber;

public class TestDataExactlyTwoDifferentMinimums {
    //pass int value from Class TestDataUniqueValues, method
    //get_expected_result()
    private TestDataUniqueValues testDataUniqueValues;
    public TestDataExactlyTwoDifferentMinimums(TestDataUniqueValues testDataUniqueValues){
        this.testDataUniqueValues = testDataUniqueValues;
    }
    public static int[] get_array(){
        int[] array = arrayWithNum();
        //check if elements are the same
        for (int f = 0; f < array.length; f += 1){
            for (int g = 0; g < array.length; g += 1){
                if (!(array[f] == array[g])){get_array();}
            }
        }
        return array;
    }
    //create an array with min numbers
    public static int[] arrayWithNum(){
        int[] array = new int[] {1, 1};
        return array;
    }
    //random numbers
    public static int random(){
        int num = TestDataUniqueValues.get_expected_result();
        return num;
    }
    public static int get_expected_result(){
        int[] array = get_array();
        int minValue = minNumber(array);
        return minValue;
    }
    public static int minNumber(int[] array){
        // this code will find the min index of the object
        int min_idx = 0;
        for (int h = 0; h < array.length; ++h){
            if(array[h] < array[min_idx]){
                min_idx = h;
            }
        }
        return min_idx;
    }
}
