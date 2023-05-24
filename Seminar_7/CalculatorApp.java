public class CalculatorApp {
    public static void main(String[] args) {

        ComplexNumber complex1 = new ComplexNumber(3, 2);
        ComplexNumber complex2 = new ComplexNumber(1, 5);

        ComplexCalculator calculator = new ComplexCalculator();

        CalculatorInvoker invoker = new CalculatorInvoker();

        Command additionCommand = new AdditionCommand(calculator, complex1, complex2);
        invoker.executeCommand(additionCommand);

        Command subtractionCommand = new SubtractionCommand(calculator, complex1, complex2);
        invoker.executeCommand(subtractionCommand);

        invoker.undoLastCommand();

        System.out.println("Command History:");
        for (Command command : invoker.getCommandHistory()) {
            System.out.println(command);
        }
    }
}