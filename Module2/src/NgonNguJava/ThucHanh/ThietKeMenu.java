package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Main Menu\n1: Hinh Tam Giac \n2: Hinh Vuong \n3: Hinh Chu Nhat\n4: Exit\nNhap Lua Chon Cua Ban");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid");
        }
    }
}
