package KeThua.ThucHanh;

public class Shape {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    String color ;
    boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(){
        this.color = "Green";
        this.filled = true;
    }
    String display(){
        return "\"A Shape with color of" + getColor() + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.printf(square.display()+"\n");

        square = new Square(2.3);
        System.out.printf(square.display()+"\n");

        square = new Square("yellow", true, 5.8);
        System.out.printf(square.display());
    }
}

