package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human children1 = new Human("child1", true, 20, new ArrayList<Human>());
        Human children2 = new Human("child2", true, 21, new ArrayList<Human>());
        Human children3 = new Human("child3", false, 22, new ArrayList<Human>());
        ArrayList<Human> list = new ArrayList<>();
        list.add(children1);
        list.add(children2);
        list.add(children3);

        Human father = new Human("father", true, 51, list);
        Human mother = new Human("mother", false, 50, list);

        list = new ArrayList<>();
        list.add(father);
        Human granddad1 = new Human("ded1", true, 90, list);
        Human grandmom1 = new Human("babka1", false, 80, list);

        list = new ArrayList<>();
        list.add(mother);
        Human granddad2 = new Human("ded2", true,91, list);
        Human grandmom2 = new Human("babka2", false, 81, list);

        System.out.println(granddad1);
        System.out.println(granddad2);
        System.out.println(grandmom1);
        System.out.println(grandmom2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
