package baitap4;

import baitap3.Movable;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return
                " x = "  + x +
                        " y = " + y +
                        " xSpeed = " + xSpeed +
                        " ySpeed = " + ySpeed ;
    }

    @Override
    public void moveUP(){
    }
    @Override
    public void moveDown(){
    }
    public void moveLeft(){

    }
    public void moveRight(){
    }
}
