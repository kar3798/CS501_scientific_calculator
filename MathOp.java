package Scientific_Calculator;

/*****************************
 * MathOp.java
 * Class for representing basic mathematical operations
 * @author Kartikeya Arvind Yadav
 * @version 20231125
 ***************************/

public class MathOp implements Operations{
    // Protected variable to store the running result
    protected static double runningResult = 0.0;

    @Override
    public double perform(double operand) {
        // Default implementation, can be overridden by specific operations
        return operand;
    }

    @Override
    public String toString() {
        return "MathOp{}";
    }

     // Method to get the running result
     public static double getRunningResult() {
        return runningResult;
    }

    // Method to update the running result
    public static void updateRunningResult(double result) {
        runningResult = result;
    }

    // Method to reset the running result
    public static void resetRunningResult() {
        runningResult = 0.0;
    }
}
