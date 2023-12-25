package Scientific_Calculator;

/*****************************
 * Addition.java
 * Class for performing addition on a array numbers
 * 
 * @author Kartikeya Arvind Yadav
 * @version 20231125
 ***************************/

public class Addition extends MathOp {

    @Override
    public double perform(double operand) {
        // Implement addition using the running result
        double result = getRunningResult() + operand;
        // Update the running result
        updateRunningResult(result);
        return result;
    }

    @Override
    public String toString() {
        return "Addition{}";
    }
}
