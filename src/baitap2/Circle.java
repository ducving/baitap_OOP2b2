package baitap2;

public class Circle implements GeometricObject {
    public double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "radius=" + radius ;
    }
    @Override
    public double getArea(){
        return radius*radius*3.14;
    }
    @Override
    public double getPerimeter(){
        return radius*2*3.14;
    }

}
