package services.Impl;

import org.springframework.stereotype.Service;
import services.Calculate;
import services.Exception.DivideToZeroEx;
import services.Models.NumberIn;

@Service
public class CalculateImpl implements Calculate {
    @Override
    public String Calculating(String using, NumberIn numberIn) {
        String result = null;
        switch (using) {
            case "+":
                result = String.valueOf(Double.parseDouble(numberIn.getNumber1()) + Double.parseDouble(numberIn.getNumber2()));
                break;
            case "-":
                result = String.valueOf(Double.parseDouble(numberIn.getNumber1()) - Double.parseDouble(numberIn.getNumber2()));
                break;

            case "*":
                result = String.valueOf(Double.parseDouble(numberIn.getNumber1()) * Double.parseDouble(numberIn.getNumber2()));
                break;
            case "/":
                    if (Double.parseDouble(numberIn.getNumber2()) == 0) {
                        return result = "invalid";
                    }
                result = String.valueOf(Double.parseDouble(numberIn.getNumber1()) * Double.parseDouble(numberIn.getNumber2()));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + using);
        }
        return result;
    }
}
