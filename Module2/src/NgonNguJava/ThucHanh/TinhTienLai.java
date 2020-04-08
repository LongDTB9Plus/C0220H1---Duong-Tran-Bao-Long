package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vay,lai;
        int thang;
        System.out.println("Nhap So Tien Vay");
        vay = scanner.nextDouble();
        System.out.println("Nhap Lai Suat");
        lai = scanner.nextDouble();
        System.out.println("Nhap So Thang Vai");
        thang = scanner.nextInt();
        double result = vay * lai/12 * thang;
        System.out.println(result);
    }
}
