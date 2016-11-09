package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by vanes on 10.11.16.
 */
public class Hippodrome
{
    public static Hippodrome game;

    ArrayList<Horse> horses = new ArrayList<>();

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public void move()
    {
        for (Horse horse: getHorses())
        {
            horse.move();
        }
    }
    public void print()
    {
        for (Horse horse: getHorses())
        {
            horse.print();
        }
        System.out.println();
        System.out.println();
    }
    public void run() {
        for (int i = 0; i < 100; i++)
        {
            move();
            print();
            try
            {
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public Horse getWinner()
    {
        Horse winner = getHorses().get(0);
        for (Horse horse: getHorses())
        {
            if (winner.getDistance() < horse.getDistance())
                winner = horse;
        }
        return winner;
    }
    public void printWinner()
    {
        Horse winner = getWinner();
        System.out.println("Winner is " + winner.getName() + "!");
    }

    public static void main(String[] args)
    {
        game = new Hippodrome();

        Horse horse1 = new Horse("horse1", 3, 0);
        Horse horse2 = new Horse("horse2", 3, 0);
        Horse horse3 = new Horse("horse3", 3, 0);

        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

        game.run();
        game.printWinner();
    }
}
