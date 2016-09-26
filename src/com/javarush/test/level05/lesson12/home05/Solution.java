package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i2 = 0;
        for(String number = " ";!(number.equals("сумма"));){
            number = reader.readLine();
            if (!(number.equals("сумма"))) {
                int NumberOne = Integer.parseInt(number);
                i2 = i2+NumberOne;
            }else if(number.equals("сумма")){
                System.out.println(i2);
            }else{
                System.out.println("Похоже что-то пошло не так!");
            }
        }
    }
}
