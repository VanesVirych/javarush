package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        double doll1, doll2;
        doll1 = convertEurToUsd(10,1.2);
        doll2 = convertEurToUsd(25,1.2);
        System.out.println(doll1);
        System.out.println(doll2);
    }

    public static double convertEurToUsd(int eur, double course){
        //напишите тут ваш код
        double result = eur * course;
        return result;
    }
}
