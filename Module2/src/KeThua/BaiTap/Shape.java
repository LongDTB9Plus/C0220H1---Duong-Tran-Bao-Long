package KeThua.BaiTap;

class Shape {
    String color = "No Color";

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    String display(){
        return ("Color:\t" + this.color);
    }
}
class Triangle extends Shape{
    double side1 = 1;
    double side2 = 1;
    double side3 = 1;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(){
    }
    double getPerimeter(){
        return (this.side1+this.side2+this.side3);
    }
    double getArea(){
        double S = getPerimeter()/2;
        return Math.sqrt(S*(S - this.side1)*(S - this.side2)*(S - this.side3));
    }
    @Override
    String display(){
        return ("Triangle with:\nSide 1:\t" + this.side1 +
                "\nSide 2:\t"+ this.side2 +
                "\nSide 3:\t" +this.side3 +
                "\nPerimeter:\t" + this.getPerimeter()+
                "\nArea :\t" + this.getArea() +
                "\n" + super.display());
    }

    public static void main(String[] args) {
        Shape shape = new Shape("Blue");
        System.out.println(shape.display());
        Triangle triangle1 = new Triangle("red",3,4,2);
        System.out.println(triangle1.display());
        Triangle triangle2 = new Triangle(4,5,6);
        System.out.println(triangle2.display());
    }
}

