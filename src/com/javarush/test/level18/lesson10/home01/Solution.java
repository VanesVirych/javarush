package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int count = 0;

        while (fileInputStream.available() > 0) {
            int b = fileInputStream.read();
            if ( (b >= 65 && b <= 90) || (b>=97 && b <= 122) )
                count++;
        }

        System.out.println(count);
        fileInputStream.close();
    }
}
