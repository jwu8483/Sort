package com.company;

import java.util.Arrays;

public class runner {
    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        int[] arr = inPlace.randIntArr(10);
        System.out.println(Arrays.toString(arr));
        inPlace.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
        System.out.println(" ");


        double[] arrDouble = inPlace.randDoubleArr(10);
        time = System.currentTimeMillis();
        System.out.println(Arrays.toString(arrDouble));
        inPlace.selectionSort(arrDouble);
        System.out.println(Arrays.toString(arrDouble));
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");
        System.out.println(" ");


        String[] arrString = inPlace.randomStringArr(10, 4);
        time = System.currentTimeMillis();
        System.out.println(Arrays.toString(arrString));
        inPlace.bubbleSort(arrString);
        System.out.println(Arrays.toString(arrString));
        time = System.currentTimeMillis() - time;
        System.out.println("Time taken: " + time * 0.001 + " seconds");


    }
}