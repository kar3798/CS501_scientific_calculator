package Scientific_Calculator;

/*****************************
 * Division.java
 * Class for performing division on a array numbers
 * @author Kartikeya Arvind Yadav
 * @version 20231125
 ***************************/

public class Division extends MathOp {
    @Override
    public double perform(double operand) {
        if (operand == 0) {
            // Throw an error for division by zero
            throw new ArithmeticException("Cannot divide by zero");
        }
        // Implement division using the running result
        double result = getRunningResult() / operand;
        // Update the running result
        updateRunningResult(result);
        return result;
    }

    @Override
    public String toString() {
        return "Division{}";
    }
}
