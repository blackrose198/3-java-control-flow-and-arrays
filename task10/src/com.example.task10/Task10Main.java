package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        //функция , которая находит индекс минимального элемента
        int min_index=0;
        int min =arr[0];
        for(int i=0;i<arr.length;++i){
            if(arr[i]<=min){
                min=arr[i];
                min_index=i;
            }
        }
        return min_index;
    }

}