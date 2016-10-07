package com.javarush.test.level14.lesson06.home01;

/**
 * Created by vanes on 05.10.16.
 */
class BelarusianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 55;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна - "
                + Country.BELARUS
                + ". Я несу "
                + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}