package NgonNguJava.BaiTap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Nguyen To Muon In Ra");
        int number = scanner.nextInt();
        int count = 1;
        String result = ("2");
        int i = 3;
        boolean checkPrime;
        while (count < number){
            checkPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    checkPrime = false;
                    break;
                }
                }
            if (checkPrime) {
                result += ("  " + i);
                count++;
            }
            i++;
        }
        System.out.println(result);

    }
}
