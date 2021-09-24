package com.techreturners.marsrover;


import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PlateauRectangleTest {

    private int upperCoordinateX;
    private int upperCoordinateY;


    @Test
    public void plateauRectangleStandardCoordinatesOfFiveFiveTest() {
        //Arrange
        //set up the maximum coordinates for the rectangle, this represents the input from the user of 5,5
        upperCoordinateX = 5;
        upperCoordinateY = 5;
        //set up the expected maximum coordinates to test against
        int expectedUpperX = 5;
        int expectedUpperY = 5;

        //Act - Construct marsplateau object
        PlateauRectangle marsplateau = new PlateauRectangle(upperCoordinateX, upperCoordinateY);

        //Assert
        //Test the number of rows in the plateau is the expected 5
        assertEquals(expectedUpperX, marsplateau.getPlateau().length);
        //test the number of columns in the plateau is the expected 5. Loop through each row to check the number of columns
        for (int count = 0; count < marsplateau.getPlateau().length; count++) {
            assertEquals(expectedUpperY, marsplateau.getPlateau()[count].length);
        }
    }

    @Test
    public void plateauRectangleMinimumCoordinatesOfTwoTwoTest() {
        //Arrange
        //set up the minimum coordinates for the rectangle, this represents the input from the user of 5,5
        upperCoordinateX = 2;
        upperCoordinateY = 2;
        //set up the expected minimum coordinates to test against
        int expectedUpperX = 2;
        int expectedUpperY = 2;

        //Act - Construct marsplateau object
        PlateauRectangle marsplateau = new PlateauRectangle(upperCoordinateX, upperCoordinateY);

        //Assert
        //Test the test the number of rows in the plateau is the expected 5
        assertEquals(expectedUpperX, marsplateau.getPlateau().length);
        //test the number of columns in the plateau is the expected 5. Loop through each row to check the number of columns
        for (int count = 0; count < marsplateau.getPlateau().length; count++) {
            assertEquals(expectedUpperY, marsplateau.getPlateau()[count].length);
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
        //set up the maximum coordinates for the rectangle, this represents the input from the user of 5,5
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
