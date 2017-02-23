package javaForImpatient.enumeration;

/**
 * Created by teodor.miu on 16-Feb-17.
 */
public enum Operation {
    ADD{
        public int eval(int arg1,int arg2){return arg1+arg2;}
    },
    SUBSTRACT{
        public int eval(int arg1,int arg2){return arg1-arg2;}
    };
    public abstract int eval(int arg1,int arg2);
}
