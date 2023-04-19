package baitap3;

public class MovablePoint implements Movable{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

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
        System.out.println(y-=ySpeed);
    }
    @Override
    public void moveDown(){
        System.out.println(y+=ySpeed);
    }
    public void moveLeft(){
        System.out.println(x-=xSpeed);
    }
    public void moveRight(){
        System.out.println(x+=xSpeed);
    }
}
