package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by vanes on 08.10.16.
 */
public class Plane implements Flyable
{
    int countPassenger;
    @Override
    public void fly()
    {
    }

    public Plane(int countPassenger)
    {
        this.countPassenger = countPassenger;
    }
}
