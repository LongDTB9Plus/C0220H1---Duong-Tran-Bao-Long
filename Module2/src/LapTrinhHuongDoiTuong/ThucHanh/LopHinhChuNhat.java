package LapTrinhHuongDoiTuong.ThucHanh;

public class LopHinhChuNhat {
    public LopHinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double width, height;

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Hinh Chu Nhat Co Dien Tich " + this.getArea() + "\t Chu Vi " + this.getPerimeter();
    }


    public static void main(String[] args) {
    LopHinhChuNhat A = new LopHinhChuNhat(20,10);
        System.out.println(A.display());
    }
}
