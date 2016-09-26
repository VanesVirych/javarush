package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        int[] ints1 = {(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),
                (int)(Math.random()*100),(int)(Math.random()*100)};
        int[] ints2 = {(int)(Math.random()*100),(int)(Math.random()*100)};
        int[] ints3 = {(int)(Math.random()*100),(int)(Math.random()*100),
                (int)(Math.random()*100),(int)(Math.random()*100)};
        int[] ints4 = {(int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),
                (int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100),
                (int)(Math.random()*100)};
        int[] ints5 = new int[0];


        list.add(ints1);
        list.add(ints2);
        list.add(ints3);
        list.add(ints4);
        list.add(ints5);
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
