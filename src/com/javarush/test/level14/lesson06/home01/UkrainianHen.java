package com.javarush.test.level14.lesson06.home01;

/**
 * Created by vanes on 05.10.16.
 */
class UkrainianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 60;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна - "
                + Country.UKRAINE
                + ". Я несу "
                + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
