package com.company;

import java.util.Arrays;

public class inPlace {

    public static void swapInt(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swapDouble(double[] arr, int i, int j)
    {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swapString(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public static void bubbleSort(String[] arr)
    {

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    swapString(arr, j, j + 1);
                }
            }
        }

    }

    public static void selectionSort(double[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int min = i;
            for(int j = i + 1; j<arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            if(min != i)
            {
                swapDouble(arr, i, min);
            }

        }
    }

    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            int mainValue = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > mainValue)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = mainValue;
        }
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

    public static double[] randDoubleArr(int count)
    {
        double[] arr = new double[count];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Math.random()*10000.0;
        }
        return arr;
    }

    public static String[] randomStringArr(int num, int length)
    {
        String [] arr = new String [num];
        while(num>0)
        {
            int i =0;
            String s = "";
            while(i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num]=s;
        }
        return arr;
    }
}