package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);

        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
        for (int i = 0; i < buffer.length; i++)
        {
            if (i%2 != 0)
            {
                fileOutputStream.write(buffer[i]);
            }
        }

        reader.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
