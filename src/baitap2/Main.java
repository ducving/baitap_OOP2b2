package baitap2;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(6);
        Rectangle rectangle=new Rectangle(4,7);
        System.out.println( circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
