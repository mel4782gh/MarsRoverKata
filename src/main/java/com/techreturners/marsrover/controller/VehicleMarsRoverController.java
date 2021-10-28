package com.techreturners.marsrover.controller;

import com.techreturners.marsrover.model.Direction;
import com.techreturners.marsrover.model.PlateauRectangle;
import com.techreturners.marsrover.model.VehicleMarsRover;

public class VehicleMarsRoverController {

    private PlateauRectangle plateauRectangle;
    private VehicleMarsRover marsRover;


    public VehicleMarsRoverController(PlateauRectangle plateau, VehicleMarsRover marsRover) {
        this.plateauRectangle = plateau;
        this.marsRover = marsRover;
    }

    public void moveVehicleOnPlateau(String moveInstructions) throws UnsupportedOperationException{
        try{
            //moveInstructions would have already been validated to contain only capital letters LRM
            //with a maximum length of 10 characters before being passed to this method
            char[] instructions = moveInstructions.toCharArray();
            for(int count=0;count<instructions.length;count++){
                if(instructions[count] == 'M'){
                    //validate move possible in direction facing
                    if(validateMoveVehicleOnPlateau()){
                        this.marsRover.move();
                    }else{
                        System.out.println("Unable to process rover instruction");
                    }
                }else if(instructions[count] == 'L'){
                    //turn rover left location and coordinates stay the same
                    this.marsRover.left();
                }else if(instructions[count] == 'R'){
                    //turn rover Right location and coordinates stay the same
                    this.marsRover.right();
                }else{
                    System.out.println("Unable to process rover instruction");
                }
            }
        //Output the location after the move instructions processed
            System.out.println("Current location of Mars Rover after move instructions: " + this.marsRover.getVehicleLocation());
        }catch (Exception e){
            System.err.println(e.getMessage() + "Last valid move location is: " + this.marsRover.getVehicleLocation());
            throw (e);
        }

    }

    public boolean validateMoveVehicleOnPlateau() throws UnsupportedOperationException {

        //get the direction to move
        Direction directionFacing = marsRover.getDirectionFacing();

        //get the vehicle x,y coordinates
        int coordinateX = this.marsRover.getCoordinateX();
        int coordinateY = this.marsRover.getCoordinateY();

        //get the plateau upper coordinates
        int maxXcoordinate = this.plateauRectangle.getUpperCoordinateX();
        int maxYCoordinate = this.plateauRectangle.getUpperCoordinateY();


        //validate if rover can move N,E,S,W within plateau size
        if (directionFacing.name().equals("North")) {
            //if direction is North then test if can move by adding 1 to Y coordinate and comparing to maxYCoordinate

            if (coordinateY + 1 >= 0 && coordinateY + 1 <= maxYCoordinate) {
                return true;
            } else {
                throw new UnsupportedOperationException("Rover cannot move out of plateau boundary.");
            }
        } else if (directionFacing.name().equals("South")) {
            //if direction is South then test if can move by subtracting 1 from Y coordinate and comparing to maxYCoordinate
            if (coordinateY - 1 >= 0 && coordinateY - 1 <= maxYCoordinate) {
                return true;
            } else {
                throw new UnsupportedOperationException("Rover cannot move out of plateau boundary.");
            }

        } else if (directionFacing.name().equals("East")) {
            //if direction is East then test if can move by adding 1 to X coordinate and comparing to maxXcoordinate
            if (coordinateX + 1 >= 0 && coordinateX + 1 <= maxXcoordinate) {
                return true;
            } else {
                throw new UnsupportedOperationException("Rover cannot move out of plateau boundary.");
            }

        } else if (directionFacing.name().equals("West")) {
            //if direction is West then test if can move by subtracting 1 from X coordinate and comparing to maxXcoordinate
            if (coordinateX - 1 >= 0 && coordinateX - 1 <= maxXcoordinate) {
                return true;
            } else {
                throw new UnsupportedOperationException("Rover cannot move out of plateau boundary.");
            }

        } else {
            return false;
        }


    }

}
