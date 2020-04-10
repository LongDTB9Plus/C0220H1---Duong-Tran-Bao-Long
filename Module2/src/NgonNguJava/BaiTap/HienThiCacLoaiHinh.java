package NgonNguJava.BaiTap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu\n1:Tam Giac\n2:Vuong\n3:Chu Nhat");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Nhap Do Dai Canh Goc Vuong");
                int x = scanner.nextInt();
                if ( x > 0) {
                    String display = "";
                    for (int i = 0; i <= x; i++) {
                        display += "\t*";
                        System.out.println(display);
                    }
                    System.out.println("");
                    for (int i = x; i >= 0; i--) {
                        for (int j = i; j >= 0; j--) {
                            System.out.print("\t*");
                        }
                        System.out.println("");
                    }
                }else System.out.println("Invalid Input");
                break;
            case 2:
                System.out.println("Nhap Do Dai Canh");
                int y = scanner.nextInt();
                if( y > 0){
                    for (int i = 0; i < y; i++){
                        for (int j = 0;j < y;j++ ){
                            System.out.print("\t*");
                        }
                        System.out.println("");
                    }
                }else System.out.println("Invalid Input");
                break;
            case 3:
                System.out.println("Nhap Chieu Rong");
                int width = scanner.nextInt();
                System.out.println("Nhap Chieu Cao");
                int height = scanner.nextInt();
                if((width > 0) && (height >0)){
                    for (int h = 0; h < height; h++){
                        for (int w = 0; w <width; w++){
                            System.out.print("\t*");
                        }
                        System.out.println("");
                    }
                }else System.out.println("Invalid Input");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
