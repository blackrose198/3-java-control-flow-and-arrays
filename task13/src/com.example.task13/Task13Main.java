package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = new int[]{};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        //функция которая убирает элементы массива, которые больше 1000
        int[] new_arr = arr;
        if (arr != null && arr.length > 0) {
            int size_new_arr = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 1000) {
                    size_new_arr++;
                }
            }
            new_arr = new int[size_new_arr];
            while (size_new_arr != 0) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < 1000) {
                        new_arr[new_arr.length-size_new_arr] = arr[i];
                        size_new_arr--;
                    }
                }
            }
        }
       return new_arr;
    }

}