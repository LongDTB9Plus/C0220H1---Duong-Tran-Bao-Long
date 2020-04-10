package MangVaPhuongThuc.BaiTap;

import sun.security.util.ArrayUtil;

import java.sql.Array;
import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3,4,5};
        int[] arrayB = {6,7,8,9,10};
        int[] combineAB = new int[arrayA.length + arrayB.length];
        for (int i = 0; i < arrayA.length;i++){
            combineAB[i] = arrayA[i];
        }
        for (int i = 0; i < arrayB.length;i++){
            combineAB[arrayA.length+i] = arrayB[i];
        }
        System.out.print(Arrays.toString(combineAB));
    }
}
