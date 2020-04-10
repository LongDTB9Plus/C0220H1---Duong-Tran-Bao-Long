package MangVaPhuongThuc.ThucHanh;

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
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int min = findMin(arr);
        System.out.printf("Min Value: '%d'\tPosition: '%d'",arr[min],min);
    }
}
