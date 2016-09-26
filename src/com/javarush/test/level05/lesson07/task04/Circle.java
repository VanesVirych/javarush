package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    int centerX, centerY, radius, width;
    String color;
    public void initialize (int x, int y, int r) {
        this.centerX=x;
        this.centerY=y;
        this.radius=r;
    }

    public void initialize (int x, int y, int r, int w) {
        this.centerX=x;
        this.centerY=y;
        this.radius=r;
        this.width=w;
    }

    public void initialize (int x, int y, int r, int w, String c) {
        this.centerX=x;
        this.centerY=y;
        this.radius=r;
        this.width=w;
        this.color=c;
    }
}
