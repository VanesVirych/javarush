package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        ArrayList<String> words = new ArrayList<>();
        String line;
        while ( (line = fileReader.readLine()) != null)
        {
            String[] strings = line.split(" ");
            for (String string: strings)
            {
                if (string.matches(".*\\d+.*")) {
                    words.add(string);
                }
            }
        }
        fileReader.close();

        FileWriter writer = new FileWriter(fileName2);
        for (String word: words) {
            writer.write(word + " ");
        }

        writer.close();
    }
}
