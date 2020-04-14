package MangVaPhuongThuc.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Hang\t");
        int row = scanner.nextInt();
        int[][] array = new int[row][row];
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("Nhap Phan Tu Thu %d -- %d\t", i, j);
                array[i][j] = scanner.nextInt();
                if (i == j) {
                    diagonal1 += array[i][j];
                }
                if ((i + j) == (row - 1)) {
                    diagonal2 += array[i][j];
                }
            }
        }
        for (int i = 0;i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.printf("Tong Cua Duong Cheo 1 La:\t%d\n",diagonal1);
        System.out.printf("Tong Cua Duong Cheo 2 La;\t%d",diagonal2);
    }
}
