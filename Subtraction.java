package Scientific_Calculator;

/*****************************
 * Substraction.java
 * Class for performing subtraction on a array numbers
 * 
 * @author Kartikeya Arvind Yadav
 * @version 20231125
 ***************************/

public class Subtraction extends MathOp {
    @Override
    public double perform(double operand) {
        // Implement subtraction using the running result
        double result = getRunningResult() - operand;
        // Update the running result
        updateRunningResult(result);
        return result;
    }

    @Override
    public String toString() {
        return "Subtraction{}";
    }
}
