package baitap1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(2,4);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        Circle circle=new Circle(7);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());

    }
}
