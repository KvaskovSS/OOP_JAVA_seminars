public class AdditionCommand implements Command {
    private ComplexCalculator calculator;
    private ComplexNumber operand1;
    private ComplexNumber operand2;
    private ComplexNumber result;

    public AdditionCommand(ComplexCalculator calculator, ComplexNumber operand1, ComplexNumber operand2) {
        this.calculator = calculator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void execute() {
        result = calculator.add(operand1, operand2);
        System.out.println("Addition Result: " + result);
    }

    public void undo() {
        calculator.subtract(result, operand2);
    }
}