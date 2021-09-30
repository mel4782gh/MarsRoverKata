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
        return this.coordinateX + " " + this.coordinateY + " " +  this.directionFacing.name();
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public Direction getDirectionFacing() {
        return directionFacing;
    }

    public void setDirectionFacing(Direction directionFacing) {
        this.directionFacing = directionFacing;
    }



    public void left(){
        //change direction 90 degrees to the left
        Direction left = this.directionFacing.leftDirection();
        this.directionFacing = left;

    }

    public void right(){
        //change direction 90 degrees to the left
        Direction right = this.directionFacing.rightDirection();
        this.directionFacing = right;

    }

    public boolean move(){
        //move one coordinate in direction facing and return boolean if successful move
        if (this.directionFacing.name().equals("North")){
            //Add one to the Y coordinate if moving one coordinate North
            this.coordinateY +=1;
            return true;
        }else if(this.directionFacing.name().equals("South")) {
            this.coordinateY -=1;
            return true;
        }else if(this.directionFacing.name().equals("East")) {
            this.coordinateX +=1;
            return true;
        }else if(this.directionFacing.name().equals("West")) {
            this.coordinateX -=1;
            return true;
        } else{
            return false;
        }

    }
}
