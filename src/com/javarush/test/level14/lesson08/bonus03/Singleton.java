package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by vanes on 07.10.16.
 */
public class Singleton
{
    private final static Singleton INSTANCE = new Singleton();
    private Singleton() {
    }
    public static Singleton getInstance() {

        return INSTANCE;
    }
}
