package baitap1;

public  class Circle extends shape {
    public double radius=1.0;
    public Circle(){}


    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return radius*radius*3.14;
    }
    @Override
    public double getPerimeter(){
          return radius*2*3.14;
    }

    @Override
    public String toString() {
        return " radius = " + radius +
                " color = " + color + '\'' +
                " filled = " + filled;
    }
}
