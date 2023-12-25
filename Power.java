package Scientific_Calculator;

/*****************************
 * Power.java
 * Class for performing math.pow() operation on 2 numbers
 * 
 * @author Kartikeya Arvind Yadav
 * @version 20231125
 ***************************/

public class Power extends MathOp {
    @Override
    public double perform(double operand) {
        if (getRunningResult() == 0.0) {
            // If the running result is 0, any power will be 0
            return 0.0;
        }
        return Math.pow(getRunningResult(), operand);
    }

    @Override
    public String toString() {
        return "Power{}";
    }
}
