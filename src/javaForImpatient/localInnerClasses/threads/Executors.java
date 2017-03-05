package javaForImpatient.localInnerClasses.threads;

import java.util.concurrent.Executor;

/**
 * Created by Asus x556 on 04-Mar-17.
 */
public class Executors {
    final static int NR_REP = 1000;
    public static void main(String[]args){

        Runnable hi = ()->{
            for(int i=0;i<NR_REP;i++){
                System.out.println("hi="+i);
            }
        };
        Runnable goodbye = () ->{
            for(int i=0;i<NR_REP;i++){
                System.out.println("goodbye="+i);
            }
        };
        System.out.println("procesoarele tale->"+Runtime.getRuntime().availableProcessors());
        Executor executor = java.util.concurrent.Executors.newCachedThreadPool();
//        Executor executor = java.util.concurrent.Executors.newFixedThreadPool(4);
        executor.execute(hi);
        executor.execute(goodbye);
    }
}
