package com.javarush.test.level15.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;
import java.math.BigInteger;

/* Факториал
Написать метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа включая его.
Пример: 4! = factorial(4) = 1*2*3*4 = 24
1. Ввести с консоли число меньше либо равно 150.
2. Реализовать функцию  factorial.
3. Если введенное число меньше 0, то вывести 0.
0! = 1
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        if (input <= 150)
            System.out.println(factorial(input));
    }

    public static String factorial(long n) {
        //add your code here
        if (n < 0)
            return String.valueOf(0);
        if (n==0)
            return String.valueOf(1);
        BigInteger bigInteger0 = new BigInteger("1");
        for (int i = 1; i <= n; i++)
        {
            bigInteger0 = bigInteger0.multiply(new BigInteger(String.valueOf(i)));
        }

        return bigInteger0.toString();
    }
}
