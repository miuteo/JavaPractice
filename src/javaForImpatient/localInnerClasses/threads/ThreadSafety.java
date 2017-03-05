package javaForImpatient.localInnerClasses.threads;

import org.omg.CORBA.Environment;

import java.util.concurrent.*;

/**
 * Created by Asus x556 on 05-Mar-17.
 */
public class ThreadSafety {
    private static  boolean done = false;
    private static final int NR_MAX=9999;
    public static void main(String[]args){
        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Runnable task1 = () ->{
                for(int i=0;i<NR_MAX;i++){
                    System.out.println("hi="+i);
                }
                done=true;
        };
        Runnable task2 = () ->{
          int i=1;
          while(!done)i++;
            System.out.println("bye="+i);
        };
        executorService.execute(task1);
        executorService.execute(task2);
    }
}
