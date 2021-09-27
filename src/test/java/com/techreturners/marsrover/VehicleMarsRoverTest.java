package com.techreturners.marsrover;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class VehicleMarsRoverTest {

    @Test
    //Test to create a rover that can store its position coordinates and direction
    public void createRoverAndGetLocationTest(){
        //Arrange
        int coordinateX = 1;
        int coordinateY= 1;


        //Expected result
        VehicleMarsRover marsRoverExpected = new VehicleMarsRover(1, 1,Direction.North);

        //Act
        VehicleMarsRover marsRover = new VehicleMarsRover(coordinateX, coordinateY, Direction.North);

        //Assert
        assertEquals(marsRoverExpected.getVehicleLocation(),marsRover.getVehicleLocation());

    }

    @Test
    public void turnRoverToTheLeftDirectionNorthChangeToWestTest(){
        //Check that direction is set to the left of rover's original location
        //That is if the rover is facing  North, and rover turns left, it should then be facing West (anit-clockwise)
        //North - West, West - South, South - East, East- North
        //Arrange
        int coordinateX = 1;
        int coordinateY= 1;


        //Expected result
        VehicleMarsRover marsRoverExpected = new VehicleMarsRover(1, 1,Direction.West);

        //Act
        VehicleMarsRover marsRover = new VehicleMarsRover(coordinateX, coordinateY, Direction.North);
        marsRover.left();
        //Assert
        assertEquals(marsRoverExpected.getVehicleLocation(),marsRover.getVehicleLocation());

    }

    @Test
    public void turnRoverToTheLeftDirectionSouthChangeToEastTest(){
        //Check that direction is set to the left of rover's original location
        //That is if the rover is facing South, and rover turns left, it should then be facing East (anit-clockwise)
        //eg North to  West, West to South, South to East, East to North
        //Arrange
        int coordinateX = 1;
        int coordinateY= 1;


        //Expected result
        VehicleMarsRover marsRoverExpected = new VehicleMarsRover(1, 1,Direction.East);

        //Act
        VehicleMarsRover marsRover = new VehicleMarsRover(coordinateX, coordinateY, Direction.South);
        marsRover.left();
        //Assert
        assertEquals(marsRoverExpected.getVehicleLocation(),marsRover.getVehicleLocation());

    }

    public void turnRoverToTheRightTest(){

    }

    public void moveRoverTest(){

    }
}
