package javaForImpatient.enumerations;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * Created by teodor.miu on 20-Feb-17.
 */

public class Main {
    public static void main(String[]args){
        Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE));
    }
}
