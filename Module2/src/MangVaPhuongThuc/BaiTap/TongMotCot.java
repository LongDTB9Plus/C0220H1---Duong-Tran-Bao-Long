package MangVaPhuongThuc.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TongMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Hang\t");
        int row = scanner.nextInt();
        System.out.println("Nhap So Cot\t");
        int collums = scanner.nextInt();
        int[][] array = new int[row][collums];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < collums; j++){
                System.out.printf("Nhap Phan Tu Thu %d -- %d\t",i,j);
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0;i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Nhap STT Cot Ban Muon Tinh\t" );
        int rowCal = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i][rowCal-1];
        }
        System.out.printf("Tong Cua Cot %d La:\t%d",rowCal,result);
    }
}
