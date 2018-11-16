package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static void swap(int[] arr, int i, int j)
    {
        int a = 0;
        arr[i] = a;
        arr[i] = arr[j];
        arr[j] = a;

    }
    public void bubbleSort(int[]arr)
    {
        int swaps = 1;
        while(swaps != 0)
        {
            swaps = 0;
            for(int i = 0; i <arr.length ; i++)
            {
                swap(arr,i,i+1);
                swaps++;
            }
        }
    }
}
