package com.javarush.test.level14.lesson06.home01;

/**
 * Created by vanes on 05.10.16.
 */
class RussianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 45;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна - "
                + Country.RUSSIA
                + ". Я несу "
                + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
