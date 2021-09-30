package com.techreturners.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VehicleMarsRoverControllerTest {

    //Controller tests
    // Test to move the rover North - move input is MM
    @Test
    public void moveVehicleWithinPlateauBoundaryTwoMovesNorth(){
        //Arrange
        PlateauRectangle plateauRectangle = new PlateauRectangle(5,5);
        //Expected MarsRover with updates location
        VehicleMarsRover vehicleMarsRoverExpected = new VehicleMarsRover(1,3,Direction.North);
        //Create a vehicle
        VehicleMarsRover vehicleMarsRover = new VehicleMarsRover(1,1,Direction.North);
        //MarsRoverController moves the rover on the plateau
        VehicleMarsRoverController marsRoverController = new VehicleMarsRoverController(plateauRectangle, vehicleMarsRover);
        //Act
        //Pass move instructions
        marsRoverController.moveVehicleOnPlateau("MM");

        //Assert
        assertEquals(vehicleMarsRoverExpected.getVehicleLocation(),vehicleMarsRover.getVehicleLocation());
    }

    // Test to move the rover East - move input is M
    @Test
    public void moveVehicleWithinPlateauBoundaryOneMoveEast(){
        //Arrange
        PlateauRectangle plateauRectangle = new PlateauRectangle(5,5);
        //Expected MarsRover with updates location
        VehicleMarsRover vehicleMarsRoverExpected = new VehicleMarsRover(2,1,Direction.East);
        //Create a vehicle
        VehicleMarsRover vehicleMarsRover = new VehicleMarsRover(1,1,Direction.East);
        //MarsRoverController moves the rover on the plateau
        VehicleMarsRoverController marsRoverController = new VehicleMarsRoverController(plateauRectangle, vehicleMarsRover);
        //Act
        //Pass move instructions
        marsRoverController.moveVehicleOnPlateau("M");

        //Assert
        assertEquals(vehicleMarsRoverExpected.getVehicleLocation(),vehicleMarsRover.getVehicleLocation());
    }
    // Test to move the rover West - move input is M

    @Test
    public void moveVehicleWithinPlateauBoundaryOneMoveWest(){
        //Arrange
        PlateauRectangle plateauRectangle = new PlateauRectangle(5,5);
        //Expected MarsRover with updates location
        VehicleMarsRover vehicleMarsRoverExpected = new VehicleMarsRover(0,1,Direction.West);
        //Create a vehicle
        VehicleMarsRover vehicleMarsRover = new VehicleMarsRover(1,1,Direction.West);
        //MarsRoverController moves the rover on the plateau
        VehicleMarsRoverController marsRoverController = new VehicleMarsRoverController(plateauRectangle, vehicleMarsRover);
        //Act
        //Pass move instructions
        marsRoverController.moveVehicleOnPlateau("M");

        //Assert
        assertEquals(vehicleMarsRoverExpected.getVehicleLocation(),vehicleMarsRover.getVehicleLocation());
    }

    // Test to move the rover South - move input is M
    @Test
    public void moveVehicleWithinPlateauBoundaryOneMoveSouth(){
        //Arrange
        PlateauRectangle plateauRectangle = new PlateauRectangle(5,5);
        //Expected MarsRover with updates location
        VehicleMarsRover vehicleMarsRoverExpected = new VehicleMarsRover(1,0,Direction.South);
        //Create a vehicle
        VehicleMarsRover vehicleMarsRover = new VehicleMarsRover(1,1,Direction.South);
        //MarsRoverController moves the rover on the plateau
        VehicleMarsRoverController marsRoverController = new VehicleMarsRoverController(plateauRectangle, vehicleMarsRover);
        //Act
        //Pass move instructions
        marsRoverController.moveVehicleOnPlateau("M");

        //Assert
        assertEquals(vehicleMarsRoverExpected.getVehicleLocation(),vehicleMarsRover.getVehicleLocation());
    }

    // Test to move the rover within plateau boundary and change direction left and right  - move input is MLMRM
    @Test
    public void moveVehicleWithinPlateauBoundaryChangeDirectionAndMove(){
        //Arrange
        PlateauRectangle plateauRectangle = new PlateauRectangle(5,5);
        //Expected MarsRover with updates location
        VehicleMarsRover vehicleMarsRoverExpected = new VehicleMarsRover(4,4,Direction.East);
        //Create a vehicle
        VehicleMarsRover vehicleMarsRover = new VehicleMarsRover(2,3,Direction.East);
        //MarsRoverController moves the rover on the plateau
        VehicleMarsRoverController marsRoverController = new VehicleMarsRoverController(plateauRectangle, vehicleMarsRover);
        //Act
        //Pass move instructions
        marsRoverController.moveVehicleOnPlateau("MLMRM");

        //Assert
        assertEquals(vehicleMarsRoverExpected.getVehicleLocation(),vehicleMarsRover.getVehicleLocation());
    }

    // Test to move the rover to try to go outside upper plateau boundary  - move input is MRMLMLMRMM
    // The rover should only be able to move to the edge of the plateau, this is its last location
    //Starts at coordinates 42N and attempts to move beyond 45N but cannot
    @Test
    public void moveVehicleToEdgePlateauBoundaryRoverPreventedFromMovingOutsideUpperBoundary(){
        //Arrange
        PlateauRectangle plateauRectangle = new PlateauRectangle(5,5);
        //Expected MarsRover with updates location
        VehicleMarsRover vehicleMarsRoverExpected = new VehicleMarsRover(4,5,Direction.North);
        //Create a vehicle
        VehicleMarsRover vehicleMarsRover = new VehicleMarsRover(4,2,Direction.North);
        //MarsRoverController moves the rover on the plateau
        VehicleMarsRoverController marsRoverController = new VehicleMarsRoverController(plateauRectangle, vehicleMarsRover);
        //Act
        //Pass move instructions
        marsRoverController.moveVehicleOnPlateau("MRMLMLMRMM");


        //Assert - check the current location is the last location of the vehicle before move to try to go out of plateau boundary
        assertEquals(vehicleMarsRoverExpected.getVehicleLocation(),vehicleMarsRover.getVehicleLocation());
    }

    // Test to move the rover to try to go outside lower plateau boundary  - move input is MRMLMM
    // The rover should only be able to move to the edge of the plateau, this is its last location
    //Starts at coordinates 52S and attempts to move beyond 40S but cannot
    @Test
    public void moveVehicleToEdgePlateauBoundaryRoverPreventedFromMovingOutsideLowerBoundary(){
        //Arrange
        PlateauRectangle plateauRectangle = new PlateauRectangle(5,5);
        //Expected MarsRover with updates location
        VehicleMarsRover vehicleMarsRoverExpected = new VehicleMarsRover(4,0,Direction.South);
        //Create a vehicle
        VehicleMarsRover vehicleMarsRover = new VehicleMarsRover(5,2,Direction.South);
        //MarsRoverController moves the rover on the plateau
        VehicleMarsRoverController marsRoverController = new VehicleMarsRoverController(plateauRectangle, vehicleMarsRover);
        //Act
        //Pass move instructions
        marsRoverController.moveVehicleOnPlateau("MRMLMM");


        //Assert - check the current location is the last location of the vehicle before move to try to go out of plateau boundary
        assertEquals(vehicleMarsRoverExpected.getVehicleLocation(),vehicleMarsRover.getVehicleLocation());
    }


    //Tests to validate the controller throws an exception if rover asked to move out of plateau boundary
    @Test(expected=UnsupportedOperationException.class)
    public void validateMoveVehicleThrowsExceptionWhenMoveNorthOutOfPlateauUpperCoordinatesBoundaryTest()  {
        //Arrange
        //Create a plateau
        PlateauRectangle plateauRectangle = new PlateauRectangle(5,5);
        //Create a vehicle
        VehicleMarsRover vehicleMarsRover = new VehicleMarsRover(5,5,Direction.North);
        //MarsRoverController  moves the rover on the plateau
        VehicleMarsRoverController marsRoverController = new VehicleMarsRoverController(plateauRectangle, vehicleMarsRover);
        //Act
        marsRoverController.validateMoveVehicleOnPlateau();
        //Assert is if an exception is thrown
    }

    @Test(expected=UnsupportedOperationException.class)
    public void validateMoveVehicleThrowsExceptionWhenMoveNorthOutOfPlateauCoordinateOneFiveBoundaryTest()  {
        //Arrange
        //Create a plateau
        PlateauRectangle plateauRectangle = new PlateauRectangle(5,5);
        //Create a vehicle
        VehicleMarsRover vehicleMarsRover = new VehicleMarsRover(1,5,Direction.North);
        //MarsRoverController moves the rover on the plateau
        VehicleMarsRoverController marsRoverController = new VehicleMarsRoverController(plateauRectangle, vehicleMarsRover);
        //Act
        //validateMoveVehicleOnPlateau throws an exception if move would be off the plateau
        marsRoverController.validateMoveVehicleOnPlateau();
        //Assert is if an exception is thrown

    }

    @Test(expected=UnsupportedOperationException.class)
    public void validateMoveVehicleThrowsExceptionWhenMoveSouthOutOfLowerCoordinatesPlateauBoundaryTest()  {
        //Arrange
        //Create a plateau
        PlateauRectangle plateauRectangle = new PlateauRectangle(5,5);
        //Create a vehicle
        VehicleMarsRover vehicleMarsRover = new VehicleMarsRover(0,0,Direction.South);
        //MarsRoverController moves the rover on the plateau
        VehicleMarsRoverController marsRoverController = new VehicleMarsRoverController(plateauRectangle, vehicleMarsRover);
        //Act
        //validateMoveVehicleOnPlateau throws an exception if move would be off the plateau
        marsRoverController.validateMoveVehicleOnPlateau();
        //Assert is if an exception is thrown

    }

    @Test(expected=UnsupportedOperationException.class)
    public void validateMoveVehicleThrowsExceptionWhenMoveEastOutOfPlateauUpperCoordinatesBoundaryTest()  {
        //Arrange
        //Create a plateau
        PlateauRectangle plateauRectangle = new PlateauRectangle(5,5);
        //Create a vehicle
        VehicleMarsRover vehicleMarsRover = new VehicleMarsRover(5,5,Direction.East);
        //MarsRoverController moves the rover on the plateau
        VehicleMarsRoverController marsRoverController = new VehicleMarsRoverController(plateauRectangle, vehicleMarsRover);
        //Act
        //validateMoveVehicleOnPlateau throws an exception if move would be off the plateau
        marsRoverController.validateMoveVehicleOnPlateau();
        //Assert is if an exception is thrown

    }

    @Test(expected=UnsupportedOperationException.class)
    public void validateMoveVehicleThrowsExceptionWhenMoveWestOutOfPlateauLowerCoordinatesBoundaryTest()  {
        //Arrange
        //Create a plateau
        PlateauRectangle plateauRectangle = new PlateauRectangle(5,5);
        //Create a vehicle
        VehicleMarsRover vehicleMarsRover = new VehicleMarsRover(0,0,Direction.West);
        //MarsRoverController moves the rover on the plateau
        VehicleMarsRoverController marsRoverController = new VehicleMarsRoverController(plateauRectangle, vehicleMarsRover);
        //Act
        //validateMoveVehicleOnPlateau throws an exception if move would be off the plateau
        marsRoverController.validateMoveVehicleOnPlateau();
        //Assert is if an exception is thrown

    }
}
