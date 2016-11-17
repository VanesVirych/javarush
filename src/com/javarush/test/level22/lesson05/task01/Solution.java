package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException
    {
        if (string == null || string.isEmpty())
            throw new TooShortStringException();
        int firstSpace = string.indexOf(' ');
        int secondSpace = 0;
        int count = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == ' ')
            {
                count++;
            }
            if (count == 4)
            {
                secondSpace = i;
            }
        }

        if (firstSpace > 0 && secondSpace > 0)
        {
            return string.substring(++firstSpace, ++secondSpace);
        } else
        {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException
    {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }
}
