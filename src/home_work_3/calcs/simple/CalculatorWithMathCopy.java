package home_work_3.calcs.simple;

import static java.lang.Math.*;

public class CalculatorWithMathCopy {
    public double plusM(double a, double b) {
        a = a + b;
        return a;
    }

    public double minusM(double a, double b) {
        a = a - b;
        return a;
    }

    public double divM(double a, double b) {
        a = a / b;
        return a;
    }

    public double multM(double a, double b) {
        a = a * b;
        return a;
    }
    public double powM(double a, double b) {
        a = pow(a, b);
        return a;
    }
    public double absM(double a)  {
        a = abs(a);
        return a;
    }
    public double sqrtM(double a) {
        a = sqrt(a);
        return a;
    }
}
