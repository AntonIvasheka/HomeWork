package home_work_3.calcs.simple;

import static java.lang.Math.*;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    @Override
    public double powM(double a, double b) {
        a = pow(a, b);
        return a;
    }
    @Override
    public double absM(double a)  {
        a = abs(a);
        return a;
    }
    @Override
    public double sqrtM(double a) {
        a = sqrt(a);
        return a;
    }

}
