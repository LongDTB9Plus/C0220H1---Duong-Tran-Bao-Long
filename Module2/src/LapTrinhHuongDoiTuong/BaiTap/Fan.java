package LapTrinhHuongDoiTuong.BaiTap;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;

    public Fan() {
    }

    private boolean on = false;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private double radius = 5;
    private String color = "Blue";

    void displayStatus(){
        if (!this.on){
            System.out.println("fan is off");
        }else System.out.printf("Spped: %d\nColor: %s\nRadius: %f\nFan Is On\n",this.speed,this.color,this.radius);
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.speed = Fan.FAST;
        fan1.radius = 10;
        fan1.color = "yellow";
        fan1.on = true;
        fan2.speed = Fan.MEDIUM;
        fan1.displayStatus();
        fan2.displayStatus();
    }
}
