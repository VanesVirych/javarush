package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        int age, weight, height;
        String name, lastname, middlename;

        public Human(int age)
        {
            this.age = age;
        }
        public Human(int age, int weight)
        {
            this.age = age;
            this.weight = weight;
        }
        public Human(int age, int weight, int height)
        {
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
        public Human(int age, int weight, int height, String name)
        {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.name = name;
        }
        public Human(int age, int weight, int height, String name, String lastname)
        {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.name = name;
            this.lastname = lastname;
        }
        public Human(int age, int weight, int height, String name, String lastname, String middlename)
        {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.name = name;
            this.lastname = lastname;
            this.middlename = middlename;
        }
        public Human(String name)
        {
            this.name = name;
        }
        public Human(String name, String lastname)
        {
            this.name = name;
            this.lastname = lastname;
        }
        public Human(String name, String lastname, String middlename)
        {
            this.name = name;
            this.lastname = lastname;
            this.middlename = middlename;
        }
        public Human(int age, int weight, String name, String lastname)
        {
            this.age = age;
            this.weight = weight;
            this.name = name;
            this.lastname = lastname;
        }
    }
}
