package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(fileReader);

        TreeMap<String, Double> map = new TreeMap<>();

        Double current;
        String line;
        while ( (line = reader.readLine()) != null) {
            String[] strings = line.split(" ");

            if (map.containsKey(strings[0])) {
                current = map.get(strings[0]);
                map.put(strings[0], current + Double.valueOf(strings[1]));
            } else {
                map.put(strings[0], Double.valueOf(strings[1]));
            }
        }

        fileReader.close();
        reader.close();

        Double max = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry: map.entrySet()) {
            if (entry.getValue() > max)
                max = entry.getValue();
        }

        for (Map.Entry<String, Double> entry: map.entrySet()) {
            if (entry.getValue() == max)
                System.out.println(entry.getKey());
        }
    }
}
