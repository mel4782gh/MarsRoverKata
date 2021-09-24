package com.techreturners.marsrover;


public class PlateauRectangle {

    private int[][] plateau;

    public PlateauRectangle(int upperCoordinateX, int upperCoordinateY) throws IllegalArgumentException {
        if (validateUpperCoordinates(upperCoordinateX, upperCoordinateY)) {
            plateau = new int[upperCoordinateX][upperCoordinateY];
        } else {
            throw new IllegalArgumentException("Please enter upper coordinates that are between 2 and 5");
        }

    }

    public int[][] getPlateau() {
        return plateau;
    }

    private boolean validateUpperCoordinates(int upperCoordinateX, int upperCoordinateY) {
        return (upperCoordinateX >= 2 && upperCoordinateX <= 5) && (upperCoordinateY >= 2 && upperCoordinateY <= 5);
    }
}
