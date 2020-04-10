package NgonNguJava;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int a = 5;
        Scanner scanner = new Scanner(System.in);
        a = Integer.parseInt(scanner.nextLine());
        int b = a + 1;
        System.out.printf("%d va %d",a,b);
    }
}
