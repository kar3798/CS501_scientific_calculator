package Scientific_Calculator;

/*****************************
 * Calculator.java
 * Class that provides a structure to organize
 * mathematical operations
 * 
 * @author Kartikeya Arvind Yadav
 * @version 20231125
 ***************************/

import java.util.Arrays;

public class Calculator {

    // Declaring an Array to store different operations
    private Operations[] ops;

    // Constructor
    public Calculator(Operations[] ops) {
        this.ops = ops;
    }

    // Method to perform calculation based on the operation invoked
    public double calculate(Operations ops, double operand) {
        double result = ops.perform(operand);
        System.out.println("Updating result..."); 
        // Update running result
        MathOp.updateRunningResult(result);
        return result;
    }

    // Method to reset the running result
    public void resetRunningResult() {
        MathOp.resetRunningResult();
    }

    // Getter, for getting the operations array
    public Operations[] getOperations() {
        return ops;
    }

    // Getter, for getting a specific operation based on user choice
    public Operations getOperation(int choice) {
        if (choice >= 1 && choice <= ops.length) {
            return ops[choice - 1];
        } 
        else {
            System.out.println("Invalid choice. Returning default operation.");
            return new MathOp();
        }
    }

    // Setter, for setting the operations array
    public void setOperations(Operations[] ops) {
        this.ops = ops;
    }

    // Method to display all available operations
    public void showOps() {
        System.out.println("Operations available in the scientific calculator:");
        for (int i = 0; i < ops.length; i++) {
            System.out.println(i + 1 + ": " + ops[i].getClass().getSimpleName());
        }
    }

    // Modifying toString() method to get calculator details
    @Override
    public String toString() {
        return "Calculator:" +
                "operations -> " + Arrays.toString(ops);
    }
}
