package com.javarush.test.level14.lesson06.home01;

/**
 * Created by vanes on 05.10.16.
 */
abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return "Я курица.";
    }
}