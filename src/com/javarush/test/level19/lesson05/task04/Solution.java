package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
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
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));

        String s;
        StringBuilder sb = new StringBuilder();
        while ( (s = bufferedReader.readLine()) != null)
        {
            sb.append(s);
        }

        String newString = sb.toString().replaceAll("\\.", "!");

        bufferedWriter.write(newString);

        bufferedReader.close();
        bufferedWriter.close();

    }
}
