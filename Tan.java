package Scientific_Calculator;

/*****************************
 * Tan.java
 * Class for tangent operation
 * 
 * @author Kartikeya Arvind Yadav
 * @version 20231130
 ***************************/

public class Tan extends MathOp {
    
    @Override
    public double perform(double operand) {
        double b = Math.toRadians(operand);
        return Math.tan(b);
    }

    @Override
    public String toString() {
        return "Tan{}";
    }
}
