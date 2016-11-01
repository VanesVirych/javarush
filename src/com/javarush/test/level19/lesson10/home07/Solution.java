package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = reader.readLine()) != null)
        {
            String[] strings = line.split(" ");
            for (String string: strings) {
                if (string.length() > 6) {
                    list.add(string);
                }
            }
        }
        reader.close();

        FileWriter fileWriter = new FileWriter(fileName2);
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size()-1)
                result = result + list.get(i);
            else
                result = result + list.get(i) + ",";
        }
        fileWriter.write(result);

        fileWriter.close();
    }
}
