package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String s = "";
        for (int i = 0; i < 10; i++)
        {
            s = s+8;
        }
        System.out.println(s);
        for (int i = 0; i < 10; i++)
        {
            System.out.println(8);
        }

    }
}