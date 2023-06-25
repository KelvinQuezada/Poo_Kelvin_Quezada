package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JTextField operand1Field;
    private JTextField operand2Field;
    private JTextField resultField;

    public View() {
        initComponents();
        setTitle("Calculadora");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        addButton = new JButton("Suma");
        subtractButton = new JButton("Resta");
        multiplyButton = new JButton("Multiplicación");
        divideButton = new JButton("División");
        operand1Field = new JTextField(10);
        operand2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        panel.add(operand1Field);
        panel.add(operand2Field);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(new JLabel("Resultado:"));
        panel.add(resultField);

        setContentPane(panel);
    }

    public int getOperand1() {
        return Integer.parseInt(operand1Field.getText());
    }

    public int getOperand2() {
        return Integer.parseInt(operand2Field.getText());
    }

    public void setResultField(String result) {
        resultField.setText(result);
    }

    public void displayErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSubtractButton() {
        return subtractButton;
    }

    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    public JButton getDivideButton() {
        return divideButton;
    }
}
