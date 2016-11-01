package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner {
        Scanner scanner;

        public PersonScannerAdapter(Scanner scanner)
        {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException
        {
            String[] strings = scanner.nextLine().split(" ");
            Calendar date = new GregorianCalendar(Integer.parseInt(strings[5]),Integer.parseInt(strings[4]) - 1, Integer.parseInt(strings[3]));

            Person p = new Person(strings[1], strings[2], strings[0], date.getTime());
            return p;
        }

        @Override
        public void close() throws IOException
        {
            this.scanner.close();
        }
    }
}
