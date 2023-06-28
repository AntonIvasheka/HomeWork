package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    long chek = 0;
    public long getCountOperation() {
        return chek;
    }
    public void incrementCountOperation() {
        chek += 1;
    }
    private CalculatorWithMathCopy ConstMathCopy;
    private CalculatorWithOperator ConstWithOperator;
    private CalculatorWithMathExtends ConstWithMathExtends;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy ConstMathCopy) {
        this.ConstMathCopy = ConstMathCopy;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator ConstWithOperator) {
        this.ConstWithOperator = ConstWithOperator;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends ConstWithMathExtends) {
        this.ConstWithMathExtends = ConstWithMathExtends;
    }
    public double plusM(double a, double b) {
        incrementCountOperation();
        return ConstMathCopy.plusM(a, b);
    }
    public double minusM(double a, double b) {
        incrementCountOperation();
        return ConstMathCopy.minusM(a, b);
    }

    public double divM(double a, double b) {
        incrementCountOperation();
        return ConstMathCopy.divM(a, b);
    }

    public double multM(double a, double b) {
        incrementCountOperation();
        return ConstMathCopy.multM(a, b);
    }

    public double powM(double a, double b) {
        incrementCountOperation();
        return ConstMathCopy.powM(a, b);
    }
    public double absM(double a)  {
        incrementCountOperation();
        return ConstMathCopy.absM(a);
    }
    public double sqrtM(double a) {
        incrementCountOperation();
        return ConstMathCopy.sqrtM(a);
    }


/*    public double plusM(double a, double b) {
        incrementCountOperation();
        return ConstWithOperator.plusM(a, b);
    }
    public double minusM(double a, double b) {
        incrementCountOperation();
        return ConstWithOperator.minusM(a, b);
    }

    public double divM(double a, double b) {
        incrementCountOperation();
        return ConstWithOperator.divM(a, b);
    }

    public double multM(double a, double b) {
        incrementCountOperation();
        return ConstWithOperator.multM(a, b);
    }

    public double powM(double a, double b) {
        incrementCountOperation();
        return ConstWithOperator.powM(a, b);
    }
    public double absM(double a)  {
        incrementCountOperation();
        return ConstWithOperator.absM(a);
    }
    public double sqrtM(double a) {
        incrementCountOperation();
        return ConstWithOperator.sqrtM(a);
    }


    public double plusM(double a, double b) {
        incrementCountOperation();
        return ConstWithMathExtends.plusM(a, b);
    }
    public double minusM(double a, double b) {
        incrementCountOperation();
        return ConstWithMathExtends.minusM(a, b);
    }

    public double divM(double a, double b) {
        incrementCountOperation();
        return ConstWithMathExtends.divM(a, b);
    }

    public double multM(double a, double b) {
        incrementCountOperation();
        return ConstWithMathExtends.multM(a, b);
    }

    public double powM(double a, double b) {
        incrementCountOperation();
        return ConstWithMathExtends.powM(a, b);
    }
    public double absM(double a)  {
        incrementCountOperation();
        return ConstWithMathExtends.absM(a);
    }
    public double sqrtM(double a) {
        incrementCountOperation();
        return ConstWithMathExtends.sqrtM(a);
    }*/
}
