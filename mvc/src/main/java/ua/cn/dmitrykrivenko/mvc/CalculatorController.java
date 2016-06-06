package ua.cn.dmitrykrivenko.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class CalculatorController {

    private final CalculatorView theView;
    private final CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int firstNumber = theView.getFirstNumber();
                int secondNumber = theView.getSecondNumber();
                int result = theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcResult(result);
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("You must enter 2 int values");
            }
        }
    }
}