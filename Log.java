package Scientific_Calculator;

/*****************************
 * Log.java
 * Class for natural log operation
 * 
 * @author Kartikeya Arvind Yadav
 * @version 20231130
 ***************************/

public class Log extends MathOp{
    
    @Override
    public double perform(double operand) {
        if (operand <= 0) {
            throw new ArithmeticException("Logarithm of non-positive number is undefined");
        }
        return Math.log(operand);
    }

    @Override
    public String toString() {
        return "Log{}";
    }
}
