package NgonNguJava.BaiTap;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        String primeNumber = "2";

        for(int i = 3; i< 100; i++){
            boolean isPrimeNumber = true;
            for(int j = 2; j < i; j++){
                if (i % j == 0){
                    isPrimeNumber = false;
                    break;
                }
            }
            if(isPrimeNumber) {
                primeNumber += "  " + i;
            }
        }
        System.out.println(primeNumber);
    }
}
