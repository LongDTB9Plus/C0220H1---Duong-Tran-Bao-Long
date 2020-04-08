package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c, max;
        max = 1;
        System.out.println("Nhap A");
        a = scanner.nextInt();
        System.out.println("Nhap B");
        b = scanner.nextInt();
        c = Math.min(a, b);
        if((a == 0 )|| (b == 0)){
            System.out.printf("Hai so '%d' va '%d' Khong Ton Tai Uoc So Lon Nhat",a,b);
        }
        for(int i = 1; i <= c; i++){
            if ((a % i == 0) && (b % i == 0)){
                max = i;
            }
        }
        System.out.printf("Uoc Chung Lon Nhat Cua '%d' Va '%d' La '%d'.",a,b,max);
    }
}
