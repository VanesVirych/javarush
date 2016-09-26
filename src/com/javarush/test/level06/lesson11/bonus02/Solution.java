package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        String grandMotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        Cat catGrandFather = new Cat(grandFatherName);
        Cat catGrandMother = new Cat(grandMotherName);
        Cat catFather = new Cat(fatherName, catGrandFather, null);
        Cat catMother = new Cat(motherName, null, catGrandMother);
        Cat catSon = new Cat(sonName,catFather,catMother);
        Cat catDaughter = new Cat(daughterName,catFather,catMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parent2, Cat parent1)
        {
            this.name = name;
            this.parent2 = parent2;
            this.parent1 = parent1;
        }

        @Override
        public String toString() {
        return "Cat name is " + name + "," +
                (parent1!=null?" mother is " + parent1.name+",":" no mother,") +
                (parent2!=null?" father is " + parent2.name:" no father");
        }
    }

}
