package services.Models;

public class NumberIn {
    private Double Number1 = 0.0;
    private Double Number2 = 0.0;
    public NumberIn(String a, String b) {
        Number1 = Double.parseDouble(a);
        Number2 = Double.parseDouble(b);
    }

    public NumberIn() {
    }

    public String getNumber1() {
        return Number1.toString();
    }

    public void setNumber1(String number1) {
        Number1 = Double.parseDouble(number1);
    }

    public String getNumber2() {
        return Number2.toString();
    }

    public void setNumber2(String number2) {
        Number2 = Double.parseDouble(number2);
    }

}
