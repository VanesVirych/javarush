package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human granddad1 = new Human("Vasya",55,true,null,null);
        Human granddad2 = new Human("Pasha",56,true,null,null);
        Human grandma1 = new Human("Masha",51,false,null,null);
        Human grandma2 = new Human("Dasha",50,false,null,null);
        Human dad = new Human("Dima",29,true,granddad1,grandma1);
        Human mom = new Human("Liza",27,false,granddad2,grandma2);
        Human children1 = new Human("Tolya",1,true,dad,mom);
        Human children2 = new Human("Zina",2,false,dad,mom);
        Human children3 = new Human("Dina",3,false,dad,mom);
        System.out.println(granddad1);
        System.out.println(granddad2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(dad);
        System.out.println(mom);
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
        private Human  father;
        private Human mother;
        public Human (String name, int age, boolean sex, Human father, Human mother) {
            this.name = name;
            this.age=age;
            this.sex = sex;
            if(father!=null) {
                this.father=father;
            }
            if(mother!=null) {
                this.mother=mother;
            }
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
