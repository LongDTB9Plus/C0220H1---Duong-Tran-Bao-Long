package LapTrinhHuongDoiTuong.BaiTap;

public class PhuongTrinhBac2 {
    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = getDiscriminant();
    }

    double a,b,c,delta;
public double getDiscriminant(){
    return Math.pow(this.b,2) - (4 * this.a * this.c);
}
public double getRoot1(){
    return (-(this.b) + Math.sqrt(delta))/(2*this.a);
}
public double getRoot2(){
    return (-(this.b) - Math.sqrt(delta))/(2*this.a);
}
public String display(){
    if (this.delta > 0){
        return "Delta > 0, phuong trinh co 2 nghiem rieng biet: root 1 = " + this.getRoot1() +"\troot 2 = " + this.getRoot2();
    }else if (this.delta == 0){
        return "Delta = 0, phuong trinh co 2 nghiem bang nhau: root = " + this.getRoot1();
    }else  return "Delta < 0, Phuong Trinh Vo Nghiem";
}

    public static void main(String[] args) {
        PhuongTrinhBac2 pt = new PhuongTrinhBac2(1,3,1);
        System.out.println(pt.display());
    }
}
