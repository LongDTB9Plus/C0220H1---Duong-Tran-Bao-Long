package KeThua.BaiTap;

public class Point {
    float x;
    float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    String display() {
        return ("x :" + this.x + " y :" + this.y);
    }
}

class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.x = 0;
        this.y = 0;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    void move() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;
    }

    @Override
    String display() {
        return (super.display() + "\tx speed :" + this.xSpeed + "\ty speed :" + this.ySpeed);
    }

    public static void main(String[] args) {
        Point point = new Point(12, 13);
        point.display();
        MovablePoint move1 = new MovablePoint(10, 10, 5, 5);
        System.out.println(move1.display());
        move1.move();
        System.out.println(move1.display());
        MovablePoint move2 = new MovablePoint(10, 10);
        System.out.println(move2.display());
        move2.move();
        System.out.println(move2.display());
    }
}
