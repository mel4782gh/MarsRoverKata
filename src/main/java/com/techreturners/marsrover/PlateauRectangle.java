package com.techreturners.marsrover;


public class PlateauRectangle {

    private int[][] plateau;
    private int upperCoordinateX;
    private int upperCoordinateY;

    public PlateauRectangle(int upperCoordinateX, int upperCoordinateY) throws IllegalArgumentException {
        if (validateUpperCoordinates(upperCoordinateX, upperCoordinateY)) {
            //if the upperCoordinates are in range 2-5 then set the upperCoordinates fields and create a plateau 2D array
            this.upperCoordinateX = upperCoordinateX;
            this.upperCoordinateY = upperCoordinateY;
            //Note the array is constructed with one more row and column added to the upper coordindates to account for row 0 and column 0
            plateau = new int[upperCoordinateX+1][upperCoordinateY+1];
        } else {
            throw new IllegalArgumentException("Please enter upper coordinates that are between 2 and 5");
        }

    }

    public int[][] getPlateau() {
        return plateau;
    }

    public int getUpperCoordinateX() {
        return upperCoordinateX;
    }

    public int getUpperCoordinateY() {
        return upperCoordinateY;
    }

    private boolean validateUpperCoordinates(int upperCoordinateX, int upperCoordinateY) {
        //check that upper coordinates are in range 2-5
        return (upperCoordinateX >= 2 && upperCoordinateX <= 5) && (upperCoordinateY >= 2 && upperCoordinateY <= 5);
    }


}
