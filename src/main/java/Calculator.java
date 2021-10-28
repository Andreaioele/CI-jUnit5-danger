import java.util.stream.DoubleStream;

import static java.lang.Math.sqrt;

public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    static double subtraction(double a, double b) {
        return a - b;
    }

    static double division(double a, double b) {
        double result = 0.0;
        if (a > 0 && b > 0) {
            result = a / b;
        } else {
            result = 0;
        }
        return result;
    }
    static double sqrtFunction(double a){
        return sqrt(a);
    }
}