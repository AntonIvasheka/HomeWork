package home_work_3.calcs.simple;

public class CalculatorWithOperator {
    int chek = 0;
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
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        if (b > 1) {
            int i = 1;
            while (i < b) {
                a = a * a;
                i++;
            }
        }
        return a;
    }
    public double absM(double a)  {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }
    public double sqrtM(double a) {
        double t;
        double squareRoot = a / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (a / t)) / 2;
        } while ((t - squareRoot) != 0);
        return squareRoot;
    }
}