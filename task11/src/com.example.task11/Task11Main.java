package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        //функция которая переставляет элементы массива
        if(arr!=null) {
            if (arr.length > 0) {
                int min_index = 0;
                int min = arr[0];
                for (int i = 0; i < arr.length; ++i) {
                    if (arr[i] <= min) {
                        min = arr[i];
                        min_index = i;
                    }
                }
                int tmp = arr[0];
                arr[0] = arr[min_index];
                arr[min_index] = tmp;
            }
        }
    }

}