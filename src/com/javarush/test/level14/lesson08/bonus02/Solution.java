package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        if (a > 0 && b > 0)
            System.out.println(nod(a, b));
    }

    private static int nod(int a, int b)
    {
        if (b == 0) return a;

        return nod(b, a % b);
    }
}
