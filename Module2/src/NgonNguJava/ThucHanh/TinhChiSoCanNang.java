package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("Nhap Can Thang Theo Kg");
        weight = scanner.nextDouble();
        System.out.println("Nhapo Chieu Cao Theo M");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        String report;
        if(bmi < 18.5){
            report = "Underweight";
        }else if ( bmi < 25.0){
            report = "Normal";
        }else if ( bmi < 30.0 ){
            report = "Overweight";
        }else report = "Obese";
        System.out.println(report);
    }
}
