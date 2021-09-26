package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {


        System.out.println(getNameOfWeekDays(7));

    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        //функция определяющая день недели
        String str;
        switch(weekDaysNumber)
        {
            case 1:str="понедельник";
                break;
            case 2:str="вторник";
                break;
            case 3:str="среда";
                break;
            case 4:str="четверг";
                break;
            case 5:str="пятница";
                break;
            case 6:str="суббота";
                break;
            case 7:str="воскресенье";
                break;
            default:str="такого дня недели не существует";
        }
        return str;
    }
}