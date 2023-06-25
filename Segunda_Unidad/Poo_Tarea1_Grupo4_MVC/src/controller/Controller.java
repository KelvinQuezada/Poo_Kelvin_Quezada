package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAddition();
            }
        });

        view.getSubtractButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSubtraction();
            }
        });

        view.getMultiplyButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMultiplication();
            }
        });

        view.getDivideButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateDivision();
            }
        });
    }

    public void calculateAddition() {
        int operand1 = view.getOperand1();
        int operand2 = view.getOperand2();

        model.setOperand1(operand1);
        model.setOperand2(operand2);

        int result = model.add();
        view.setResultField(String.valueOf(result));
    }

    public void calculateSubtraction() {
        int operand1 = view.getOperand1();
        int operand2 = view.getOperand2();

        model.setOperand1(operand1);
        model.setOperand2(operand2);

        int result = model.subtract();
        view.setResultField(String.valueOf(result));
    }

    public void calculateMultiplication() {
        int operand1 = view.getOperand1();
        int operand2 = view.getOperand2();

        model.setOperand1(operand1);
        model.setOperand2(operand2);

        int result = model.multiply();
        view.setResultField(String.valueOf(result));
    }

    public void calculateDivision() {
        int operand1 = view.getOperand1();
        int operand2 = view.getOperand2();

        model.setOperand1(operand1);
        model.setOperand2(operand2);

        try {
            double result = model.divide();
            view.setResultField(String.valueOf(result));
        } catch (ArithmeticException e) {
            view.displayErrorMessage("Error: " + e.getMessage());
        }
    }
}
