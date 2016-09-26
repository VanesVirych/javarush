package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    int top,left,weight,height;

    public void initialize (int t, int l, int w, int h) {
        this.top=t;
        this.left=l;
        this.weight=w;
        this.height=h;
    }
    public void initialize (int t, int l) {
        this.top=t;
        this.left=l;
        this.weight=this.height=0;
    }
    public void initialize (int t, int l, int w) {
        this.top=t;
        this.left=l;
        this.weight=w;
        this.height=w;

    }
    public void initialize (Rectangle rectangle) {
        this.top=rectangle.top;
        this.left=rectangle.left;
        this.weight=rectangle.weight;
        this.height=rectangle.height;
    }
}
