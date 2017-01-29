package javaForImpatient.localInnerClasses.anonymousClasses;

import javaForImpatient.localInnerClasses.localClasses.IntSequence;

import java.util.Random;

/**
 * Created by Ionela on 1/29/2017.
 */
public class Anonymous {
    static Random generator = new Random();
    public static IntSequence randomInts(int low, int high){
        return new IntSequence() {
            @Override
            public int next() {
                return low + generator.nextInt(high-low+1);
            }

            @Override
            public boolean hasNext() {
                return true;
            }
        };
    }

}
