package javaForImpatient.localInnerClasses.threads;

/**
 * Created by Asus x556 on 04-Mar-17.
 */
public class Main {
    public static void main(String[]args){
        int n=1000;
        Runnable hi = () ->{
            for (int i=0;i<n;i++)
                System.out.println("hi "+i);
        };
        new Thread(() ->{
            for (int i=0;i<n;i++) {
                System.out.println("goodbye "+i);
            }
        }).start();
        new Thread(hi).start();
    }
}
