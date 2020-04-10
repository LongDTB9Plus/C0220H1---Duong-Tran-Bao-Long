package MangVaPhuongThuc.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row,col;
        do {
            System.out.println("Nhap So Hang Cua Mang 2 Chieu");
            row = scanner.nextInt();
            System.out.println("Nhap So Cot Cuar Mang 2 Chieu");
            col = scanner.nextInt();
        }while ((row <= 0) || (col <= 0));
        int[][] array = new int[row][col];
        int min = 0;
        String index = "00";
        for(int i = 0; i < row; i++){
            for ( int j = 0; j < col ; j++){
                System.out.printf("Nhap Gia Tri Vi Tri %d%d :",i,j);
                array[i][j] = scanner.nextInt();
                if((i == 0) && (j == 0)){
                    min = array[0][0];
                }
                if (array[i][j] < min){
                    min = array[i][j];
                    index = String.valueOf(i) +"--"+ String.valueOf(j);
                }
            }
        }
        for (int i = 0; i < row; i++){
            System.out.printf(Arrays.toString(array[i])+"\n");
        }
        System.out.printf("\t Min Position %s Min Value %d",index,min);

    }
}
