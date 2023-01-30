package math;

public class Square extends Shape{
    double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double area(){
        return side /Math.pow(side, 2);
    }
}
