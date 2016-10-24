package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static final int PRODUCT_NAME_COUNT_SPACE = 30;
    public static final int ID_COUNT_SPACE = 8;
    public static final int PRICE_COUNT_SPACE = 8;
    public static final int QUANTITY_COUNT_SPACE = 4;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        String productName = "";
        for (int i = 1; i < args.length-2; i++)
            productName += args[i] + " ";
        productName = addSpaces(productName, PRODUCT_NAME_COUNT_SPACE);

        String price = addSpaces(args[args.length-2], PRICE_COUNT_SPACE);

        String quantity = addSpaces(args[args.length-1], QUANTITY_COUNT_SPACE);

        String id = addSpaces(getID(fileName), ID_COUNT_SPACE);

        FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
        fileOutputStream.write(id.getBytes());
        fileOutputStream.write(productName.getBytes());
        fileOutputStream.write(price.getBytes());
        fileOutputStream.write(quantity.getBytes());
    }

    private static String getID(String fileName) throws IOException
    {
        List<Long> longList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        String line;
        while ( (line = reader.readLine()) != null )
        {
            line = line.substring(0, 8).trim();
            Long value = Long.parseLong(line);
            longList.add(value);
        }

        Long max = Collections.max(longList) + 1;
        return max.toString();

    }

    private static String addSpaces(String s, int countSpace)
    {
        String result;
        if (s.length() >= countSpace) {
            return s.substring(0, countSpace);
        } else
        {
            String spaces = "";
            for (int i = 0; i < (countSpace - s.length()); i++)
                spaces += " ";
            result = s + spaces;
        }
        return result;
    }
}
