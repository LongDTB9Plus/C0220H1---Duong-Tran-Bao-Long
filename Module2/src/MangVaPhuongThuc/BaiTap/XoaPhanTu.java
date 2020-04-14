package MangVaPhuongThuc.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        int[] newArray = new int[array.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Phan Tu Can Tim");
        boolean count = false;
        int x = scanner.nextInt();
        for (int i = 0; i < array.length; i++){
            if (array[i] == x){
                count = true;
                continue;
                }else newArray[i] = array[i];
            }
        if (count){
            System.out.print(Arrays.toString(newArray));
        }else System.out.printf("Phan tu %d Ban muon Xoa Khong Co Trong Mang",x);
    }
}
