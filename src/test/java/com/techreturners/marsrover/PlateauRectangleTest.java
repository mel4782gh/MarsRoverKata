package com.techreturners.marsrover;


import org.junit.Before;
import org.junit.Test;

public class PlateauRectangleTest {

    private int  upperCoordinateX;
    private int upperCoordinateY;

    @Before
    public void setup() {
        upperCoordinateX =5;
        upperCoordinateY =5;
    }
    @Test
    public void plateauRectangleTest (){
        //Arrange
        //Construct marsplateau object
        PlateauRectangle marsplateau = new PlateauRectangle(upperCoordinateX,upperCoordinateY);
        //Expected result
        int[][] expectedplateau = new int [5][5];

        //Act



        //Assert
        assertEquals(expectedplateau.length, marsplateau.length);
    }


}
