package com.techreturners.marsrover;

public class VehicleMarsRover {
    private int coordinateX;
    private int coordinateY;
    private Direction directionFacing;

    public VehicleMarsRover(int coordinateX, int coordinateY, Direction direction){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.directionFacing = direction;
    }

    public String getVehicleLocation(){
        return coordinateX + coordinateY + directionFacing.name();
    }

    public void left(){
        //change direction 90 degrees to the left
        Direction left = this.directionFacing.leftDirection();
        this.directionFacing = left;

    }
}
