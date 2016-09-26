package com.javarush.test.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        String date = "JULY 3 2017";
        System.out.println(date + " = " + isDateOdd(date));

    }

    public static boolean isDateOdd(String date)
    {
        Date date1 = new Date();
        date1.setMonth(0);
        date1.setDate(1);

        Date date2 = new Date(date);

        long time = date2.getTime()-date1.getTime();
        long days = time/(24*60*60*1000);

        if(days%2!=0)
            return true;
        else
            return false;
    }
}
