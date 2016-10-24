package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String file1 = args[1];
        String file2 = args[2];

        crypt(file1, file2);

    }

    private static void crypt(String file1, String file2) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        while (fileInputStream.available() > 0)
        {
            int b = fileInputStream.read();
            fileOutputStream.write(b ^ 13);
        }
        fileInputStream.close();
        fileOutputStream.close();


    }


}
