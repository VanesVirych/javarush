package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = bufferedReader.readLine()) != null)
            sb.append(s + " ");
        bufferedReader.close();

        String[] words = sb.toString().split(" ");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));
        for (String word: words)
        {
            try
            {
                Integer.parseInt(word);
                bufferedWriter.write(word + " ");

            }
            catch (NumberFormatException e)
            {
            }

        }
        bufferedWriter.close();
    }
}
