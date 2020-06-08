package services.Impl;

import org.springframework.stereotype.Service;
import services.Calculate;
import services.Exception.DivideToZeroEx;
@Service
public class CalculateImpl implements Calculate {
    @Override
    public double Calculating(String using, Double a, Double b) {
        Double result = null;
        switch (using) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;

            case "*":
                result = a * b;
                break;
            case "/":
                try {
                    if (b == 0) {
                        throw new DivideToZeroEx();
                    }
                } catch (DivideToZeroEx ex) {
                    break;
                }
                result = a / b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + using);
        }
        return result;
    }
}
