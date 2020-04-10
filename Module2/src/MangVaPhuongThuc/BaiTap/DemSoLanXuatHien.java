package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String string = scanner.nextLine();
        System.out.println("Nhap Ky Tu Can Kiem Tra");
        String character = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == character.charAt(0)){
                count++;
            }
        }
        System.out.printf("Ky Tu %s Xuat Hien %d Lan",character,count);
    }
}
