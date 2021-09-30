package com.techreturners.marsrover;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class VehicleMarsRoverTest {

    private  int coordinateX = 1;
    private int coordinateY=1;


    @Test
    //Test to create a rover that can store its position coordinates and direction
    public void createRoverAndGetLocationTest(){
        //Arrange
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
        //That is if the rover is facing South, and rover turns left, it should then be facing East (moves anti-clockwise)
        //eg North to  West, West to South, South to East, East to North
        //Arrange
        //Expected result
        VehicleMarsRover marsRoverExpected = new VehicleMarsRover(1, 1,Direction.East);

        //Act
        VehicleMarsRover marsRover = new VehicleMarsRover(coordinateX, coordinateY, Direction.South);
        marsRover.left();
        //Assert
        assertEquals(marsRoverExpected.getVehicleLocation(),marsRover.getVehicleLocation());

    }
    @Test
    public void turnRoverToTheRightNorthToEastTest(){
        //Check that direction is set to the right of rover's original location
        //That is if the rover is facing North, and rover turns right, it should then be facing East (moves clockwise)
        //eg North to East, East to South, South to West, West to North
        //Arrange
        //Expected result
        VehicleMarsRover marsRoverExpected = new VehicleMarsRover(1, 1,Direction.East);

        //Act
        VehicleMarsRover marsRover = new VehicleMarsRover(coordinateX, coordinateY, Direction.North);
        marsRover.right();
        //Assert
        assertEquals(marsRoverExpected.getVehicleLocation(),marsRover.getVehicleLocation());
    }

    @Test
    public void turnRoverToTheRightWestToNorthTest(){
        //Check that direction is set to the right of rover's original location
        //That is if the rover is facing West, and rover turns right, it should then be facing North (moves clockwise)

        //Arrange
        //Expected result
        VehicleMarsRover marsRoverExpected = new VehicleMarsRover(1, 1,Direction.North);

        //Act
        VehicleMarsRover marsRover = new VehicleMarsRover(coordinateX, coordinateY, Direction.West);
        marsRover.right();
        //Assert
        assertEquals(marsRoverExpected.getVehicleLocation(),marsRover.getVehicleLocation());
    }

    @Test
    public void moveRoverNorthOneCoordinateOnPlateauTest(){
        //Create a MarsRoverVehicle with coordinates 1,1 and direction North
        //Pass rover instruction M to move in the direction it is facing on the plateau
        //The Rover's new location should be 1,2 direction North

        //Arrange
        //Expected result
        VehicleMarsRover marsRoverExpected = new VehicleMarsRover(1, 2,Direction.North);

        VehicleMarsRover marsRover = new VehicleMarsRover(coordinateX, coordinateY, Direction.North);
        //Act

        marsRover.move();

        //Assert
        assertEquals(marsRoverExpected.getVehicleLocation(),marsRover.getVehicleLocation());


    }

    @Test
    public void moveRoverSouthOneCoordinateOnPlateauTest(){
        //Create a MarsRoverVehicle with coordinates 1,1 and direction South
        //Pass rover instruction M to move in the direction it is facing on the plateau
        //The Rover's new location should be 1,0 direction South

        //Arrange
        //Expected result
        VehicleMarsRover marsRoverExpected = new VehicleMarsRover(1, 0,Direction.South);

        VehicleMarsRover marsRover = new VehicleMarsRover(coordinateX, coordinateY, Direction.South);
        //Act

        marsRover.move();

        //Assert
        assertEquals(marsRoverExpected.getVehicleLocation(),marsRover.getVehicleLocation());
    }

    @Test
    public void moveRoverEastOneCoordinatesOnPlateauTest(){
        //Create a MarsRoverVehicle with coordinates 1,1 and direction East
        //Pass rover instruction M to move in the direction it is facing on the plateau
        //The Rover's new location should be 2,1 direction East

        //Arrange
        //Expected result
        VehicleMarsRover marsRoverExpected = new VehicleMarsRover(2, 1,Direction.East);

        VehicleMarsRover marsRover = new VehicleMarsRover(coordinateX, coordinateY, Direction.East);
        //Act

        marsRover.move();

        //Assert
        assertEquals(marsRoverExpected.getVehicleLocation(),marsRover.getVehicleLocation());
    }

    @Test
    public void moveRoverWestOneCoordinatesOnPlateauTest(){

        //Create a MarsRoverVehicle with coordinates 1,1 and direction East
        //Pass rover instruction M to move in the direction it is facing on the plateau
        //The Rover's new location should be 2,1 direction East

        //Arrange
        //Expected result
        VehicleMarsRover marsRoverExpected = new VehicleMarsRover(0, 1,Direction.West);

        VehicleMarsRover marsRover = new VehicleMarsRover(coordinateX, coordinateY, Direction.West);
        //Act

        marsRover.move();

        //Assert
        assertEquals(marsRoverExpected.getVehicleLocation(),marsRover.getVehicleLocation());
    }


}
