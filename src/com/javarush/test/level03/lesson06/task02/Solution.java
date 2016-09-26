package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int a4 = 4;
        int a5 = 5;
        int a6 = 6;
        int a7 = 7, a8 = 8, a9 =9, a10 = 10;

        System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5+" "+a6+" "+a7+" "+a8+" "+a9+" "+a10);
        System.out.println(a2+" "+a2*a2+" "+a2*a3+" "+a2*a4+" "+a2*a5+" "+a2*a6+" "+a2*a7+" "+a2*a8+" "+a2*a9+" "+a2*a10);
        System.out.println(a3+" "+a3*a2+" "+a3*a3+" "+a3*a4+" "+a3*a5+" "+a3*a6+" "+a3*a7+" "+a3*a8+" "+a3*a9+" "+a3*a10);
        System.out.println(a4+" "+a4*a2+" "+a4*a3+" "+a4*a4+" "+a4*a5+" "+a4*a6+" "+a4*a7+" "+a4*a8+" "+a4*a9+" "+a4*a10);
        System.out.println(a5+" "+a5*a2+" "+a5*a3+" "+a5*a4+" "+a5*a5+" "+a5*a6+" "+a5*a7+" "+a5*a8+" "+a5*a9+" "+a5*a10);
        System.out.println(a6+" "+a6*a2+" "+a6*a3+" "+a6*a4+" "+a6*a5+" "+a6*a6+" "+a6*a7+" "+a6*a8+" "+a6*a9+" "+a6*a10);
        System.out.println(a7+" "+a7*a2+" "+a7*a3+" "+a7*a4+" "+a7*a5+" "+a7*a6+" "+a7*a7+" "+a7*a8+" "+a7*a9+" "+a7*a10);
        System.out.println(a8+" "+a8*a2+" "+a8*a3+" "+a8*a4+" "+a8*a5+" "+a8*a6+" "+a8*a7+" "+a8*a8+" "+a8*a9+" "+a8*a10);
        System.out.println(a9+" "+a9*a2+" "+a9*a3+" "+a9*a4+" "+a9*a5+" "+a9*a6+" "+a9*a7+" "+a9*a8+" "+a9*a9+" "+a9*a10);
        System.out.println(a10+" "+a10*a2+" "+a10*a3+" "+a10*a4+" "+a10*a5+" "+a10*a6+" "+a10*a7+" "+a10*a8+" "+a10*a9+" "+a10*a10);
    }
}