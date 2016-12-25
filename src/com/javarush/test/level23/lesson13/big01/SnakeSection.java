package com.javarush.test.level23.lesson13.big01;

public class SnakeSection
{
    private int x;
    private int y;


    public SnakeSection(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode()
    {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) return true;
        if (!(obj instanceof SnakeSection)) {
            return false;
        }
        SnakeSection section = (SnakeSection) obj;
        return section.getX() == getX() && section.getY() == getY();
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}
