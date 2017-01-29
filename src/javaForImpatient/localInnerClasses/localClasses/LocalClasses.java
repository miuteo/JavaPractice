package javaForImpatient.localInnerClasses.localClasses;

import java.util.Random;

/**
 * Created by Ionela on 1/29/2017.
 */
public class LocalClasses {
    public static Random random = new Random();
    public static IntSequence randomInts(int low,int high){
        class RandomSequence implements IntSequence{

            @Override
            public int next() {
                return low + random.nextInt(high-low+1);
            }

            @Override
            public boolean hasNext() {
                return true;
            }
        }
        return new RandomSequence();
    }
    public static void main(String[]args){
        IntSequence intSequence = LocalClasses.randomInts(1,10);
        System.out.println(intSequence.next());
    }
}
