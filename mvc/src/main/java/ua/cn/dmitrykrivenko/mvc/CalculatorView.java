package ua.cn.dmitrykrivenko.mvc;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame {

    private final JTextField firstNumber = new JTextField(10);
    private final JLabel additionLabel = new JLabel("+");
    private final JTextField secondNumber = new JTextField(10);
    private final JButton calculateButton = new JButton("Calculate");
    private final JTextField calcSolution = new JTextField(10);

    CalculatorView() {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 100);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcResult(int result) {
        calcSolution.setText(Integer.toString(result));
    }

    void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButton.addActionListener(listenForCalcButton);
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage, "Input Error", JOptionPane.ERROR_MESSAGE);
    }
}
