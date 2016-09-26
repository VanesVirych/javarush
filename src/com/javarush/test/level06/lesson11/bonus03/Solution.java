package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(reader.readLine());
            //System.out.println(arr[i]);
        }
        //Arrays.sort(arr);
        //for (int i = 0; i < 5; i++)
        //{
        //    System.out.println(arr[i]);
        //}
        int temp;
        for (int i = arr.length - 1; i >= 0; i--)
        {
            for (int j = 0; j < i; j ++)
            {
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
