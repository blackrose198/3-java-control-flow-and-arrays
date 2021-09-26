package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println(getMin(5,4,3));

    }

    static int getMin(int a, int b, int c) {
        //функция, возвращающая минимальное число
        int min1 = Math.min(a, b);
        int min2 = Math.min(min1, c);
        return min2;
    }
}