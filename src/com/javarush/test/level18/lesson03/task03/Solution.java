package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream in = new FileInputStream(fileName);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        while (in.available() > 0)
            list.add(in.read());
        in.close();

        int[] count = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            count[i] = 0;
            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(i) == list.get(j)) {
                    count[i]++;
                }
            }
        }

        int max = 0;
        for (int a: count) {
            if (a > max)
                max = a;
        }

        for (int i = 0; i < list.size(); i++) {
            if (!resultList.contains(list.get(i)) && count[i] == max) {
                resultList.add (list.get(i));
            }
        }

        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i) + " ");
        }
    }
}
