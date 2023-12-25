package Scientific_Calculator;

/*****************************
 * Sin.java
 * Class for sine operation
 * 
 * @author Kartikeya Arvind Yadav
 * @version 20231125
 ***************************/

public class Sin extends MathOp {

    @Override
    public double perform(double operand) {
        double b = Math.toRadians(operand);
        return Math.sin(b);
    }

    @Override
    public String toString() {
        return "Sin{}";
    }
}
