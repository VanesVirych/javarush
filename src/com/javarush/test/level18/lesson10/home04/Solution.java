package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream file1Input = new FileInputStream(fileName1);
        FileInputStream file2 = new FileInputStream(fileName2);

        byte[] buffer1 = new byte[file1Input.available()];
        file1Input.read(buffer1);

        byte[] buffer2 = new byte[file2.available()];
        file2.read(buffer2);

        FileOutputStream file1Output = new FileOutputStream(fileName1);
        file1Output.write(buffer2);

        FileOutputStream file1Output2 = new FileOutputStream(fileName1, true);
        file1Output2.write(buffer1);

        reader.close();
        file1Input.close();
        file2.close();
        file1Output.close();
        file1Output2.close();
    }
}
