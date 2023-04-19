package baitap1;

public class Square extends Rectangle{
    public double side;
    public Square(){}

    public Square(double side) {
        this.side = side;
    }
    public Square(double side,String color,boolean filled){
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double side){
        System.out.println("dads");
    }
    @Override
    public void setLength(double side){
        System.out.println("dasdsadasds");
    }

    @Override
    public String toString() {
        return  " side = " + side +
                " width = " + width +
                " length = " + length +
                " color = " + color +
                " filled = " + filled ;
    }
}
