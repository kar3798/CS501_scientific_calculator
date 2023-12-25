package Scientific_Calculator;

/**
 * OpTester.java
 * NOT THE MAIN DRIVER CLASS
 * Class for testing the mathematical operations
 * 
 * @author Kartikeya Arvind Yadav
 * @version 20231130
 */
public class OpTester {

    // Main Method
    public static void main(String[] args) {
        // Array object for storing the different math operations
        Operations[] opsArray = {
                new Addition(),
                new Subtraction(),
                new Multiplication(),
                new Division(),
                new Power(),
                new Sin(),
                new Cos(),
                new Tan(),
                new Log()
        };

        // Declaring a calculator object with the array of operations
        Calculator calc = new Calculator(opsArray);

        // Testing with static values
        double initial_Operand = 5.0;

        // Testing each operation
        for (Operations ops : opsArray) {
            double operand = initial_Operand;
            try {
                // Displaying the operation being tested
                System.out.println("Testing " + ops.getClass().getSimpleName() + ":");

                // Displaying the initial operand value
                System.out.println("Initial Operand: " + operand);

                // Performing the operation
                double result = calc.calculate(ops, operand);

                // Displaying the result
                System.out.println("Result: " + result);
                System.out.println("***************************************");

                // Incrementing the operand for the next test
                initial_Operand++;
            } catch (ArithmeticException e) {
                // Handle division by zero or log of non-positive number
                System.out.println("Error: " + e.getMessage());
                System.out.println("***************************************");
            }
        }
    }
}
