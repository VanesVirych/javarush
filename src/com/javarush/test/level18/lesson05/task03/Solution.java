package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fi1 = new FileInputStream(reader.readLine());
        FileOutputStream fo2 = new FileOutputStream(reader.readLine());
        FileOutputStream fo3 = new FileOutputStream(reader.readLine());

        if (fi1.available() % 2 == 0)
        {
            byte[] buffer1 = new byte[fi1.available()/2];
            byte[] buffer2 = new byte[fi1.available()/2];
            int count1 = fi1.read(buffer1);
            int count2 = fi1.read(buffer2);
            fo2.write(buffer1, 0, count1);
            fo3.write(buffer2, 0, count2);
        } else
        {
            byte[] buffer1 = new byte[fi1.available()/2 + 1];
            byte[] buffer2 = new byte[fi1.available()/2];
            int count1 = fi1.read(buffer1);
            int count2 = fi1.read(buffer2);
            fo2.write(buffer1, 0, count1);
            fo3.write(buffer2, 0, count2);
        }


        reader.close();
        fi1.close();
        fo2.close();
        fo3.close();
    }
}
