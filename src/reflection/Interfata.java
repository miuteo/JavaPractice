package reflection;

/**
 * Created by teodor.miu on 15-Feb-17.
 */
public interface Interfata extends Cloneable {
    default void salut(){
        System.out.println("salut");
    }
//    default int hashCode(){
//        return 5;
//    }You can't define a default method for ToString,equals, or hashcode.As a cibbseqyebce if the "classes win" rule,
// such a method could never win against Object.toString or Object.equals
}
