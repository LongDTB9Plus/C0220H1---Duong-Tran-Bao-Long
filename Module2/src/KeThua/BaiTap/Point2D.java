package KeThua.BaiTap;

import java.util.Arrays;

public class Point2D {
    float x = 0;
    float y = 0;
   public   float[] array = new float[2];

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
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

    public void setXY(float x, float y) {
        this.array[0] = x;
        this.array[1] = y;
    }

    public float[] getXY() {
        return this.array = new float[]{this.x, this.y};
    }

    String display() {
        return ("x position:\t" + this.x + "\ty position:\t" + this.y);
    }
}

class Point3D extends Point2D {
    float z = 0;
    public float[] xyz = new float[3];

    public float[] getXyz() {
        return xyz;
    }

    public void setXyz(float x, float y, float z) {
        this.xyz = new float[]{x,y,z};
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }



    String display() {
        return (super.display() + "\tz position :\t" + this.z);
    }

    public static void main(String[] args) {
        Point2D point1 = new Point2D(10, 12);
        System.out.println(point1.display());
        System.out.print(Arrays.toString(point1.array) +"\n");
        Point3D point2 = new Point3D(6, 7, 8);
        System.out.println(point2.display());
        System.out.printf(Arrays.toString(point2.xyz));
    }
}
