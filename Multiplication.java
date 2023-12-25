package Scientific_Calculator;

/*****************************
 * Multiplication.java
 * Class for performing multiplication on a array numbers
 * 
 * @author Kartikeya Arvind Yadav
 * @version 20231125
 ***************************/

public class Multiplication extends MathOp {
    @Override
    public double perform(double operand) {
        // Implement multiplication using the running result
        double result = getRunningResult() * operand;
        // Update the running result
        updateRunningResult(result);
        return result;
    }

    @Override
    public String toString() {
        return "Multiplication{}";
    }
}
