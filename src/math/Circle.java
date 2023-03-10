package math;

public class Circle extends Shape{
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.PI * radius /Math.pow(radius, 2);
    }
}
