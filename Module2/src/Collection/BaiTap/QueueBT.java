package Collection.BaiTap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueBT {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        Scanner scanner = new Scanner(System.in);
        System.out.print("input num: ");
        int result = 0;
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++){
            result = queue.poll();
            queue.add(result);
            queue.add(result);
        }
        System.out.println(result);
    }
}
