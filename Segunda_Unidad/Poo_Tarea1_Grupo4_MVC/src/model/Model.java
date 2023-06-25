package model;

public class Model {
    private int operand1;
    private int operand2;

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public int add() {
        return operand1 + operand2;
    }

    public int subtract() {
        return operand1 - operand2;
    }

    public int multiply() {
        return operand1 * operand2;
    }

    public double divide() {
        if (operand2 == 0) {
            throw new ArithmeticException("División por cero no esta permitida");
        }
        return (double) operand1 / operand2;
    }
}