package javaForImpatient.localInnerClasses.lambdas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {
        System.out.println(true && false || true && true && true);



    }
    public  void doWork(){
         new Thread(()-> System.out.println(this.toString())).start();
    }

    public static void repeatMessage(int n,String message){
        Runnable runnable  = () ->{
            for(int i=0;i<n;i++)
                System.out.println(message);
            try {
                Thread.sleep( (long)(Math.random() * 10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(runnable).start();
    }
    public static void repeatMessage2(){
        for(int i =0;++i<1;){
            System.out.println(i);
        }
    }


    public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return (Comparator<T> & Serializable)
                (c1, c2) -> Integer.compare(keyExtractor.applyAsInt(c1), keyExtractor.applyAsInt(c2));
    }

    public static void accessingVariableFromEnclosingScope(int n){
        for(int i=0;i<n;i++){
            int x = i;
            new Thread( () -> System.out.println(x) ).start();
            //variable used in lambda should be final or effectively final
        }
    }
    public static void accessingVariableFromEnclosingScope(String[]args){
        for(String arg:args){
               new Thread( () -> System.out.println(arg) ).start();
        }
    }
    public static void accessingVariableFromEnclosingScope2(ArrayList<String> arraylist){
        for(Iterator<String> i = arraylist.iterator();i.hasNext(); ){
            String item = i.next();
            new Thread( () -> System.out.println(item) ).start();
        }
    }
    public static void accessingVariableFromEnclosingScope3(String[]args){
        for(int i=0;i<args.length;i++){
            String arg = args[i];
            new Thread( () -> System.out.println(arg) ).start();
        }
    }
    public static Comparator<String> reverse(Comparator<String> comp){
        return (x,y) -> comp.compare(x,y);
    }
    public static Comparator<String> compareWithDirection(int direction){
        return (x,y) -> direction* x.compareTo(y);
    }


}
