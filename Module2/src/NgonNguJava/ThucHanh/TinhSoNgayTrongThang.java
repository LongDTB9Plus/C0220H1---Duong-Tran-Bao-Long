package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Thang Muon Kiem Tra:");
        int month = scanner.nextInt();
        String day;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = " 30";
                break;
            case 2:
               day = "28 Hoac 29";
                break;
            default:
               day = "";
        }
        if(!day.equals("")){
            System.out.printf("Thang '%d' Co %s Ngay", month, day);
        }else System.out.println("Nhap Sai");
    }
}
