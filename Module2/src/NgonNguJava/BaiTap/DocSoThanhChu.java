package NgonNguJava.BaiTap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Can Doc");
        int number = scanner.nextInt();
        int numberHundreds;
        int numberTens;
        int numberDigit;
        String convert = null;
        if (number <= 12) {
            switch (number) {
                case 1:
                    convert = "one";
                    break;
                case 2:
                    convert = "two";
                    break;
                case 3:
                    convert = "three";
                    break;
                case 4:
                    convert = "four";
                    break;
                case 5:
                    convert = "five";
                    break;
                case 6:
                    convert = "six";
                    break;
                case 7:
                    convert = "seven";
                    break;
                case 8:
                    convert = "eight";
                    break;
                case 9:
                    convert = "nine";
                    break;
                case 10:
                    convert = "ten";
                    break;
                case 0:
                    convert = "zero";
                    break;
                case 11:
                    convert = "eleven";
                    break;
                case 12:
                    convert = "twelve";
                    break;
            }
        }
        if ((number > 12) && (number < 20)) {
            numberDigit = number - 10;
            switch (numberDigit) {
                case 3:
                    convert = "third";
                    break;
                case 4:
                    convert = "four";
                    break;
                case 5:
                    convert = "fif";
                    break;
                case 6:
                    convert = "six";
                    break;
                case 7:
                    convert = "seven";
                    break;
                case 8:
                    convert = "eight";
                    break;
                case 9:
                    convert = "nine";
                    break;
            }
            convert += "teen";
        }
        if ((number >= 20) && (number < 100)) {
            numberTens = number / 10;
            numberDigit = number - numberTens * 10;
            switch (numberTens) {
                case 2:
                    convert = "twenty";
                    break;
                case 3:
                    convert = "thirty";
                    break;
                case 4:
                    convert = "forty";
                    break;
                case 5:
                    convert = "fifty";
                    break;
                case 6:
                    convert = "sixty";
                    break;
                case 7:
                    convert = "seventy";
                    break;
                case 8:
                    convert = "eighty";
                    break;
                case 9:
                    convert = "ninety";
                    break;
            }
            switch (numberDigit) {
                case 1:
                    convert += " " + "one";
                    break;
                case 2:
                    convert += " " + "two";
                    break;
                case 3:
                    convert += " " + "three";
                    break;
                case 4:
                    convert += " " + "four";
                    break;
                case 5:
                    convert += " " + "five";
                    break;
                case 6:
                    convert += " " + "six";
                    break;
                case 7:
                    convert += " " + "seven";
                    break;
                case 8:
                    convert += " " + "eight";
                    break;
                case 9:
                    convert += " " + "nine";
                    break;
            }
        }

        if ((number > 100) && (number < 1000)) {
            numberHundreds = number / 100;
            numberTens = (number % 100) % 10;
            numberDigit = number % 10;
            switch (numberHundreds) {
                case 1:
                    convert = "one hundred";
                    break;
                case 2:
                    convert = "two hundred";
                    break;
                case 3:
                    convert = "three hundred";
                    break;
                case 4:
                    convert = "four hundred";
                    break;
                case 5:
                    convert = "five hundred";
                    break;
                case 6:
                    convert = "six hundred";
                    break;
                case 7:
                    convert = "seven hundred";
                    break;
                case 8:
                    convert = "eight hundred";
                    break;
                case 9:
                    convert = "nine hundred";
                    break;
            }
            convert += " and ";
            switch (numberTens) {
                case 2:
                    convert += "twenty";
                    break;
                case 3:
                    convert += "thirdty";
                    break;
                case 4:
                    convert += "forty";
                    break;
                case 5:
                    convert += "fifty";
                    break;
                case 6:
                    convert += "sixty";
                    break;
                case 7:
                    convert += "seventy";
                    break;
                case 8:
                    convert += "eighty";
                    break;
                case 9:
                    convert += "ninety";
                    break;
            }
            switch (numberDigit) {
                case 1:
                    convert += " " + "one";
                    break;
                case 2:
                    convert += " " + "two";
                    break;
                case 3:
                    convert += " " + "three";
                    break;
                case 4:
                    convert += " " + "four";
                    break;
                case 5:
                    convert += " " + "five";
                    break;
                case 6:
                    convert += " " + "six";
                    break;
                case 7:
                    convert += " " + "seven";
                    break;
                case 8:
                    convert += " " + "eight";
                    break;
                case 9:
                    convert += " " + "nine";
                    break;
            }
        }
        System.out.println(convert);
    }
}



