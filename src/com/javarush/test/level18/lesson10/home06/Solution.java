package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);
        HashMap<Byte, Integer> map = new HashMap<>();
        int count;

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        Arrays.sort(buffer);

        for (byte b: buffer) {
            count = 0;

            for (byte b1 : buffer) {
                if (b == b1)
                    count++;
            }

            if (!map.containsKey(b)) {
                map.put(b, count);
                System.out.println((char)b + " " + count);
            }
        }

        fileInputStream.close();
    }
}
