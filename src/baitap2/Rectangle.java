package baitap2;

public class Rectangle implements GeometricObject{
    public double width;
    public double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return
                "width=" + width +
                ", length=" + length;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return (width+length)*2;
    }

}
