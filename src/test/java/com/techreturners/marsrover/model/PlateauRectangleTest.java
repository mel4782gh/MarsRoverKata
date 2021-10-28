package com.techreturners.marsrover.model;


import com.techreturners.marsrover.model.PlateauRectangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlateauRectangleTest {

    private int upperCoordinateX;
    private int upperCoordinateY;


    @Test
    public void plateauRectangleMaximumCoordinatesOfFiveFiveTest() {
        //Arrange
        //set up the maximum coordinates for the rectangle, this represents the input from the user of 5,5
        upperCoordinateX = 5;
        upperCoordinateY = 5;
        //set up the expected number of rows and columns to test against, note that coordinates of 5,5 will create a
        // plateau - 2D array - which has 0-5 rows and 0-5 columns therefore we expect 6 rows and 6 columns
        int expectedRows = 6;
        int expectedColumns = 6;

        //Act - Construct marsplateau object
        //This will construct an 2D array of 0-5 rows and 0-5 columns
        PlateauRectangle marsplateau = new PlateauRectangle(upperCoordinateX, upperCoordinateY);

        //Assert
        //Test the number of rows in the plateau is the same as expected plateau
        assertEquals(expectedRows, marsplateau.getPlateau().length);
        //test the number of columns in the plateau is the expected 5. Loop through each row to check the number of columns
        for (int count = 0; count < marsplateau.getPlateau().length; count++) {
            assertEquals(expectedColumns, marsplateau.getPlateau()[count].length);
        }
    }

    @Test
    public void plateauRectangleMinimumCoordinatesOfTwoTwoTest() {
        //Arrange
        //set up the minimum coordinates for the rectangle, this represents the input from the user of 2,2
        upperCoordinateX = 2;
        upperCoordinateY = 2;
        //set up the expected minimum number of rows and columns to test against, note that coordinates of 2,2 will create a
        // plateau - 2D array - which has 0-2 rows and 0-2 columns therefore we expect 3 rows and 3 columns
        int expectedRows = 3;
        int expectedColumns = 3;

        //Act - Construct marsplateau object
        PlateauRectangle marsplateau = new PlateauRectangle(upperCoordinateX, upperCoordinateY);

        //Assert
        //Test the test the number of rows in the plateau is the expected 5
        assertEquals(expectedRows, marsplateau.getPlateau().length);
        //test the number of columns in the plateau is the expected 5. Loop through each row to check the number of columns
        for (int count = 0; count < marsplateau.getPlateau().length; count++) {
            assertEquals(expectedColumns, marsplateau.getPlateau()[count].length);
        }
    }

    @Test
    public void plateauRectangleCoordinatesAboveMaximumThrowIllegalArgumentExceptionTest() {
        //Arrange
        //set up the coordinates above 5,5 for the rectangle, this represents the input from the user
        upperCoordinateX = 6;
        upperCoordinateY = 6;

        try {
            //Act - Construct marsplateau object
            PlateauRectangle marsplateau = new PlateauRectangle(upperCoordinateX, upperCoordinateY);
            //Assert
            fail("Expected illegal argument exception did not occur");
        } catch (IllegalArgumentException e) {
            //Exception has occurred and test passes
        }
    }

    @Test
    public void plateauRectangleCoordinatesBelowMinimumThrowIllegalArgumentExceptionTest() {
        //Arrange
        //set up the coordinates below 2,2, this represents the input from the user
        upperCoordinateX = 1;
        upperCoordinateY = 1;

        try {
            //Act - Construct marsplateau object
            PlateauRectangle marsplateau = new PlateauRectangle(upperCoordinateX, upperCoordinateY);
            //Assert
            fail("Expected illegal argument exception did not occur");
        } catch (IllegalArgumentException e) {
            //Exception has occurred and test passes
        }

    }

    @Test
    public void plateauRectangleCoordinatesNegativeThrowIllegalArgumentExceptionTest() {
        //Arrange
        //set up negative coordinates for the rectangle, this represents the input from the user of -1,-1
        upperCoordinateX = -1;
        upperCoordinateY = -1;

        try {
            //Act - Construct marsplateau object
            PlateauRectangle marsplateau = new PlateauRectangle(upperCoordinateX, upperCoordinateY);
            //Assert
            fail("Expected illegal argument exception did not occur");
        } catch (IllegalArgumentException e) {
            //Exception has occurred and test passes
        }

    }
}
