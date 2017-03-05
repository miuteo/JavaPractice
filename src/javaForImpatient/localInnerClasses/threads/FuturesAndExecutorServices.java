package javaForImpatient.localInnerClasses.threads;

import java.util.concurrent.*;
import java.util.concurrent.Executors;

/**
 * Created by Asus x556 on 04-Mar-17.
 */
public class FuturesAndExecutorServices {
    public static void main(String[]args){
        ExecutorService executor = Executors.newCachedThreadPool();
        Callable<String> task1= ()->{
            for(int i=0;i<99999;i++){
                if(i%1000==0)
                System.out.println("task1="+i);
            }
            return "hello1";
        };
        Callable<String> task2= ()->{
            for(int i=0;i<99999;i++){
                if(i%1000==0)
                System.out.println("task2="+i);
            }
            return "hello2";
        };
        Future<String> result1 = executor.submit(task1);
       Future<String> result2 = executor.submit(task2);
        try {
            System.out.println(result1.get());
            System.out.println(result2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
