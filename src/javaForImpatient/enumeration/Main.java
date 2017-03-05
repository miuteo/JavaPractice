package javaForImpatient.enumeration;

/**
 * Created by teodor.miu on 16-Feb-17.
 */
public class Main {
    public static void main(String[]args){
        Operation op = Operation.ADD;
        System.out.println(op.eval(2,3));
    }
}
