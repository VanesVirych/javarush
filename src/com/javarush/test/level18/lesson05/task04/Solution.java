package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/



import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0) {
            fileInputStream.read(buffer);
        }

        List<Byte> list = new ArrayList<>();

        for (byte b: buffer) {
            list.add(b);
        }

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++)
        {
            buffer[i] = list.get(i);
        }

        fileOutputStream.write(buffer);

        reader.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
