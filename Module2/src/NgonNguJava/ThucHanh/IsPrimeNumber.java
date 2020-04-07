package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        boolean check = true;
        if (number < 2){
            check = false;
        }
        if(number > 2){
            for(int i = 2;i < number ; i++){
                if (number % i == 0){
                    check = false;
                    break;
                }
            }
        }
        if (check){
            System.out.println(number + " is a Prime Number");
        }else System.out.println(number + " is not a Prime Number");
    }
}
