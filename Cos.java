package Scientific_Calculator;

/*****************************
 * Cos.java
 * Class for cosine operation
 * 
 * @author Kartikeya Arvind Yadav
 * @version 20231130
 ***************************/

public class Cos extends MathOp {

    @Override
    public double perform(double operand) {
        double b = Math.toRadians(operand);
        return Math.cos(b);
    }

    @Override
    public String toString() {
        return "Cos{}";
    }
}
