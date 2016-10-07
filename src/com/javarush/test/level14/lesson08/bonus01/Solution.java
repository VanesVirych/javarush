package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileNotFoundException;
import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try {
            int[] a = new int[5];
            a[5] = 5;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            List a = new ArrayList();
            a.get(1);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int a = Integer.parseInt("String");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String string = "123";
            char chr = string.charAt(5);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] a = new int[5];
            a = null;
            System.out.println(a[0]);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] a = new int[-1];
        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.add( new FileNotFoundException() );
        exceptions.add( new BufferOverflowException() );
        exceptions.add( new IllegalStateException("MyException") );
    }
}
