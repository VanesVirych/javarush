package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] a = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++)
        {
            a[i] = scanner.nextInt();
        }
        int[] a1 = new int[10];
        int[] a2 = new int[10];

        for (int i = 0; i < 10; i++)
        {
            a1[i] = a[i];
            a2[i] = a[a.length/2+i];
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(a2[i]);
        }
    }
}
