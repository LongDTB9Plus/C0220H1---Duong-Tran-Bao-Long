package NgonNguJava.BaiTap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So USD Muon Quy Doi Thanh VND");
        double usd = scanner.nextDouble();
        double rate = 23000;
        double vnd = usd*rate;
        System.out.printf("'%f' USD = '%f' VND",usd,vnd);
    }
}
