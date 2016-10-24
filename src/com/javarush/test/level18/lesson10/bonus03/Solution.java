package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

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
import java.util.List;

public class Solution {
    public static final int PRODUCT_NAME_COUNT_SPACE = 30;
    public static final int ID_COUNT_SPACE = 8;
    public static final int PRICE_COUNT_SPACE = 8;
    public static final int QUANTITY_COUNT_SPACE = 4;

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        ArrayList<String> list = getList(fileName);
        ArrayList<Long> idList = getIDList(fileName);
        PrintWriter printWriter = null;
        int index = idList.indexOf(Long.parseLong(args[1]));

        if (args[0].equals("-u"))
        {
            String id = addSpaces(args[1], ID_COUNT_SPACE);
            String productName = "";
            for (int i = 2; i < args.length-2; i++)
                productName += args[i] + " ";
            productName = addSpaces(productName, PRODUCT_NAME_COUNT_SPACE);
            String price = addSpaces(args[args.length-2], PRICE_COUNT_SPACE);
            String quantity = addSpaces(args[args.length-1], QUANTITY_COUNT_SPACE);

            String newLine = id + productName + price + quantity;

            if (idList.contains(Long.parseLong(args[1])))
            {
                list.set(index, newLine);
                printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
                for (String line : list)
                    printWriter.println(line);
            }
            printWriter.close();
        } else if (args[0].equals("-d"))
        {
            list.remove(index);
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
            for (String aString : list)
                printWriter.println(aString);
            printWriter.close();
        }
    }
    public static ArrayList<String> getList (String fileName) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line=bufferedReader.readLine()) != null) {
            list.add(line);
        }
        bufferedReader.close();
        return list;
    }

    public static ArrayList<Long> getIDList (String fileName) throws IOException {
        ArrayList<Long> list = new ArrayList<Long>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        Long id;
        while ((line=bufferedReader.readLine()) != null) {
            line = line.substring(0, 8).trim();
            id = Long.parseLong(line);
            list.add(id);
        }
        bufferedReader.close();
        return list;
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
