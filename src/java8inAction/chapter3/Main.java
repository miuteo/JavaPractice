package java8inAction.chapter3;

/**
 * Created by Asus x556 on 11-Mar-17.
 */
public class Main {
    public static void main(String[]args){
        int x=5;
        Runnable r = ()->{
            System.out.println(x);
        };
        new Thread(r).start();
//        x=6;
    }
}
