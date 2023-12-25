package Scientific_Calculator;

import java.util.InputMismatchException;

/*****************************
 * ScientificCalc.java
 * Driver Class
 * 
 * @author Kartikeya Arvind Yadav
 * @version 20231125
 ***************************/

import java.util.Scanner;

public class ScientificCalc {

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

        // Declaring an object of scanner class to get user object
        Scanner keyboardInput = new Scanner(System.in);

        // Running sum of the result
        double result = 0;

        // infinite loop
        while (true) {
            // Clears the console screen
            // System.out.println("\033[H\033[2J");
            // System.out.flush();

            System.out.println();
            System.out.println("***************************************");
            System.out.println("SCIENTIFIC CALCULATOR");
            // Display the running total
            System.out.println("Current Result: " + result);
            System.out.println("***************************************");

            // Calling showOps() method
            calc.showOps();

            // Printing instructions to quit the calculator
            System.out.println("Enter 0 to EXIT");
            System.out.println("Enter CLEAR to reset the result");
            System.out.println("***************************************");
            System.out.println("Enter your choice: ");

            // Taking user input for mathematical operation
            String inputChoice = keyboardInput.next();

            if (inputChoice.equals("0")) {
                System.out.println("Closing the scientific calculator !!!");
                break;
            }

            // Clearing result if user types CLEAR
            if (inputChoice.equalsIgnoreCase("CLEAR")) {
                calc.resetRunningResult();
                result = 0;
                System.out.println("Result Cleared");
                continue;
            }

            // Try catch loop to parse the user entered integers
            try {
                int choice = Integer.parseInt(inputChoice);

                // Validates that the choice is within range
                if (choice < 1 || choice > opsArray.length) {
                    throw new IllegalArgumentException("Invalid choice. Please enter a valid operation or CLEAR.");
                }

                // Getting the selected mathematical operation
                Operations ops = calc.getOperation(choice);

                System.out.println(ops.toString() + " operation selected");

                // Printing different user prompt depending on the operation selected
                if (ops instanceof Sin || ops instanceof Cos || ops instanceof Tan) {
                    // If the operation is sin, cos, tan
                    System.out.println("Enter the angle in degrees: ");
                } else if (ops instanceof Log) {
                    // If the operation is log
                    System.out.println("Enter the number to calculate natural log: ");
                } else {
                    // For other operations
                    System.out.println("Enter the number: ");
                }
                // Consume the newline character
                keyboardInput.nextLine();
                double operand = keyboardInput.nextDouble();

                // Performing the operation and updating the running total
                result = calc.calculate(ops, operand);

                System.out.println(
                        "Result of " + ops.toString() + " with operand " + operand + " is: " + result);
            } catch (InputMismatchException e) {
                // Handle non-numeric input
                System.out.println("Error: Please enter a valid numeric value.");
                // Clear the scanner buffer
                keyboardInput.nextLine();
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println("Error: Please enter a valid number.");
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                // Handle invalid choice
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a number between 1 and " + opsArray.length + " or CLEAR.");
            }
        }
        keyboardInput.close();
    }
}
