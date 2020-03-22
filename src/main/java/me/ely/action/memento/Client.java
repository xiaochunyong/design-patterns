package me.ely.action.memento;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImp();
        calculator.setFirstNumber(100);
        calculator.setSecondNumber(200);

        PreviousCalculationToCareTaker backup = calculator.backupLastCalculation();

        System.out.println(calculator.getCalculationResult());

        calculator.setFirstNumber(100);
        calculator.setSecondNumber(-390);

        System.out.println(calculator.getCalculationResult());

        calculator.restorePreviousCalculation(backup);
        System.out.println(calculator.getCalculationResult());
    }
}
