package com.javarush.test.level14.lesson06.home01;

/**
 * Created by vanes on 05.10.16.
 */
class MoldovanHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 50;
    }
    String getDescription() {
        return super.getDescription() + " Моя страна - "
                + Country.MOLDOVA
                + ". Я несу "
                + getCountOfEggsPerMonth()
                + " яиц в месяц.";
    }
}
