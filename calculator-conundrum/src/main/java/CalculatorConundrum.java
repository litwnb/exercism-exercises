class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        String result;
        if (operation == null)
            throw new IllegalArgumentException("Operation cannot be null");
        if (operation.isEmpty())
            throw new IllegalArgumentException("Operation cannot be empty");
        switch (operation) {
            case "+" -> {
                int sum = operand1 + operand2;
                result = operand1 + " + " + operand2 + " = " + sum;
            }
            case "*" -> {
                int mul = operand1 * operand2;
                result = operand1 + " * " + operand2 + " = " + mul;
            }
            case "/" -> {
                if (operand2 == 0)
                    throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
                int div = operand1 / operand2;
                result = operand1 + " / " + operand2 + " = " + div;
            }
            default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        return result;
    }
}
