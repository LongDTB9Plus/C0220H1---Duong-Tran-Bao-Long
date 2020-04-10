package MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin Chon Phuong Thuoc Quy Doi\n1: C -> F\n2: F -> C");
        int choice = scanner.nextInt();
        double c;
        double f;
        switch (choice){
            case  1:
                System.out.println("nhap So Do Celsius Ban Muon Quy Doi");
                c =  Double.parseDouble(String.valueOf(scanner.next()));
                f = (9.0 / 5) * c + 32;
                System.out.printf("Fahrenheit = '%f'",f);
                break;
            case 2:
                System.out.println("nhap So Do Fahrenheit Ban Muon Quy Doi");
                f = Double.parseDouble(String.valueOf(scanner.next()));
                c = (5.0 / 9) * (f - 32);
                System.out.printf("Celsius = '%f'",c);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
