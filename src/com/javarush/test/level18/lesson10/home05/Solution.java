package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);

        StringBuilder sb = new StringBuilder();

        String[] s = new String(buffer).split(" ");

        for (int i = 0; i < s.length; i++)
        {
            sb.append(Math.round(Double.valueOf(s[i])));
            sb.append(" ");
        }

        fileOutputStream.write(sb.toString().getBytes());

        reader.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
