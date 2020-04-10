package MangVaPhuongThuc.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class ChenPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        boolean check;
        int positionChoice;
        do {
            System.out.println("Chon Vi Tri Ban Muon Chen Phan Tu");

             positionChoice = scanner.nextInt();
            check = ((positionChoice < array.length - 1) && (positionChoice > 0));
        } while (!check);
        System.out.printf("Nhap Gia Tri Muon Chen Vao Vi Tri '%d'",positionChoice);
        int value = scanner.nextInt();
        int temp = 0;
        for (int i = positionChoice ; i <= array.length-1 ; i++){
            temp = array[i];
            array[i] = value;
            value = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
