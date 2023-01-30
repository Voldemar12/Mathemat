package math;

public class Main {
    public static void main(String[] args) {
       Circle circle = new Circle();
       circle.radius = 6;
       System.out.println(String.format("%.1f", circle.area()));

       Triangle triangle = new Triangle();
       triangle.base = 2;
       triangle.height = 3;
       System.out.println(triangle.area());

       Square square = new Square();
       square.side = 5;
       System.out.println(square.area());

       Rectangle rectangle = new Rectangle();
       rectangle.height = 6;
       rectangle.width = 8;
       System.out.println(rectangle.area());
    }
}