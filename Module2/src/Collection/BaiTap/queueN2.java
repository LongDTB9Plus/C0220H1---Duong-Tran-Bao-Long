package Collection.BaiTap;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class queueN2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> A = new PriorityQueue<>();
        for (int i = 1; i <= 5; i++) {
            A.add(i);
        }
//        nhập số lượt chơi
        System.out.println("Nhap So Luot Choi");
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextInt();
//        tính số vòng lặp toàn chuỗi đã qua
        int loopTime = 0;
        for (int i = 1; i < time; i++){
            double a = Math.floor(Math.pow(2,i));
            double b = Math.floor((time+5)/5);
            if (a ==b){
                loopTime = i;
                break;
            }else if (a > b){
                loopTime = i - 1;
                break;

            }
        }

//        tính số vòng lặp đơn cách biệt
        int loopTimeDiff = (int) (time - ((A.size()*Math.pow(2,loopTime)) - 5));
//        tính số cụm số đã lặp qua tại lần lặp time
        int PosDone = (int) Math.floor(loopTimeDiff /(Math.pow(2,loopTime)));
//        xác định cụm số hiện tại
        if (PosDone >= 5){
            PosDone = PosDone - 5;
        }
        System.out.println(A.toArray()[PosDone]);
    }
}
