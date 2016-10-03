package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new FileReader(reader.readLine()));

        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        String sNumber;

        while ((sNumber = reader2.readLine()) != null) {
            int number = Integer.parseInt(sNumber);
            if(number % 2 == 0) {
                arraylist.add(number);
            }
        }
        Collections.sort(arraylist);

        for(int number: arraylist) {
            System.out.println(number);
        }
    }
}
