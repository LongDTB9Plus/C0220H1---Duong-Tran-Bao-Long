package MangVaPhuongThuc.BaiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static int findMin(int []array){
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin Nhap Do Dai Mang");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            System.out.printf("Nhap Gia Tri Phan Tu Thu %d",i+1);
            arr[i] = scanner.nextInt();
        }
        int min = findMin(arr);
        System.out.printf("Min Value: '%d'\tPosition: '%d'",arr[min],min);
    }
}
