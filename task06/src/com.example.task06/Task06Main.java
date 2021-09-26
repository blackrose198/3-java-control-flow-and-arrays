package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {
        //функция для нахождения максимума
        int max_1 = Math.max(a,b);
        int max_2 = Math.max(c,d);
        int max = Math.max(max_1, max_2);
        return max;
    }

}