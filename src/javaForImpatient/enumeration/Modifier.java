package javaForImpatient.enumeration;

import java.util.RandomAccess;

/**
 * Created by teodor.miu on 16-Feb-17.
 */
public enum Modifier {
    PUBLIC,PRIVATE,PROTECTED,STATIC,FINAL,ABSTRACT;
    private static int maskBit = 1;
    private int mask;
     Modifier(){
//        mask = maskBit; //the enumerated constants are constructed before static members,so you can;t refer any static
//                          members
//        maskBit *=2;
    }
    static{
         int maskBit = 1;
         for(Modifier m:Modifier.values()){
             m.mask = maskBit;
             maskBit *=2;
         }
    }
    RandomAccess a;
}
