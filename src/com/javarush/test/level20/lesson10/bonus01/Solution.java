package com.javarush.test.level20.lesson10.bonus01;

import java.util.ArrayList;
import java.util.List;

/* Алгоритмы-числа
Число S состоит из M чисел, например, S=370 и M(количество цифр)=3
Реализовать логику метода getNumbers, который должен среди натуральных чисел меньше N (long)
находить все числа, удовлетворяющие следующему критерию:
число S равно сумме его цифр, возведенных в M степень
getNumbers должен возвращать все такие числа в порядке возрастания

Пример искомого числа:
370 = 3*3*3 + 7*7*7 + 0*0*0
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8

На выполнение дается 10 секунд и 50 МБ памяти.
*/
public class Solution {
    public static int[] getNumbers(int N) {
        int[] result = null;

        List<Integer> list = new ArrayList<>();
        String stringOfDigits;
        int lengthNumber, sum, number;
        byte temp;
        int[] currentArray;
        for (int i = 1; i < N; i++)
        {
            if (i < 10) {
                list.add(i);
            } else {
                stringOfDigits = Integer.toString(i);
                lengthNumber = stringOfDigits.length();
                currentArray = new int[lengthNumber];
                for (int ci = 0; ci < lengthNumber; ci++)
                {
                    currentArray[ci] = stringOfDigits.charAt(ci) - '0';
                }

                sum = 0;
                for (int j = 0; j < lengthNumber; j++)
                {
                    temp = (byte) currentArray[j];
                    number = 1;
                    for (int k = 0; k < lengthNumber; k++)
                    {
                        number *= temp;
                    }
                    sum += number;
                }

                if (i == sum)
                    list.add(sum);
            }
        }

        result = new int[list.size()];
        int i = 0;
        for (Integer n : list) {
            result[i++] = n;
        }

        return result;
    }

    public static void main(String[] args)
    {
        long startTime = System.nanoTime();
        long startRam = Runtime.getRuntime().freeMemory();
        int[] ints = getNumbers(21474672);
        long endRam = Runtime.getRuntime().freeMemory();
        long endTime = System.nanoTime();
        System.out.println((startRam - endRam)/1048576);
        System.out.println((double) (endTime - startTime) / 1000000000.0);
        for (int i = 0; i < ints.length; i++)
        {
            System.out.println(ints[i]);
        }
    }
}
