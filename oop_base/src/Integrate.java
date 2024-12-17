import  java.util.function.DoubleUnaryOperator;


public class Integrate {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double res = 0;
        double step = 10e-6;
        double current = a + step;
        double prev = a;
        while (prev < b) {
            res = res + f.applyAsDouble(prev) * (current - prev);
            prev = current;
            current = current + step;
        }
        return res;
    }

}
