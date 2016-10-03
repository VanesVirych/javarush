package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.nio.charset.Charset;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        PrintStream printStream = new PrintStream(reader.readLine());

        while (true) {
            String s = reader.readLine();
            printStream.print(s);
            if (s.equals("exit")) {
                printStream.close();
                break;
            }

            printStream.print("\n");
        }
    }
}
