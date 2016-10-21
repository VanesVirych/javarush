package com.javarush.test.level17.lesson10.bonus02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        int id;

        try
        {
            if (args[0].equals("-d"))
            {
                Person person;
                for (int i = 1; i < args.length; i++)
                {
                    id = Integer.parseInt(args[i]);
                    person = allPeople.get(id);
                    person.setBirthDay(null);
                }
            }
            else if (args[0].equals("-i"))
            {
                Person p;
                for (int i = 1; i < args.length; i++)
                {
                    id = Integer.parseInt(args[i]);
                    p = allPeople.get(id);

                    dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

                    System.out.println(p.getName() + " " +
                            (p.getSex().equals(Sex.MALE) ? "м" : "ж") + " " +
                            dateFormat.format(p.getBirthDay()));
                }
            }
            else if (args[0].equals("-c"))
            {
                Person p;
                for (int i = 1; i < args.length; i += 3)
                {
                    if (args[i+1].equals("м"))
                        p = Person.createMale(args[i], dateFormat.parse(args[i+2]));
                    else
                        p = Person.createFemale(args[i], dateFormat.parse(args[i+2]));

                    allPeople.add(p);
                    System.out.println(allPeople.indexOf(p));
                }
            }
            else if (args[0].equals("-u"))
            {
                Person person;

                for (int i = 1; i < args.length; i += 4)
                {
                    id = Integer.parseInt(args[i]);

                    person = allPeople.get(id);

                    person.setBirthDay(dateFormat.parse(args[i+3]));
                    person.setName(args[i+1]);

                    if (args[i+2].equals("м"))
                        person.setSex(Sex.MALE);
                    else if (args[i+2].equals("ж"))
                        person.setSex(Sex.FEMALE);
                }
            }
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
}
