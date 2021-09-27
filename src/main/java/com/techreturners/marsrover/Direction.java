package com.techreturners.marsrover;

public enum Direction {
    North, East, South, West;

    //declare array of direction values
    static public final Direction[] values = values();

    public Direction leftDirection() {
        //return previous value in list
        return values[(ordinal() - 1  + values.length) % values.length];
    }

    public Direction rightDirection() {
        //return next value in list
        return values[(ordinal() + 1) % values.length];
    }
}
