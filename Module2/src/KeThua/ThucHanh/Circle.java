package KeThua.ThucHanh;

public class Circle extends Shape{
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 1;
    }
    double getArea(){
        return Math.pow(this.radius,2) * Math.PI;
    }
    double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
    @Override
    String display(){
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.display();
    }
}
