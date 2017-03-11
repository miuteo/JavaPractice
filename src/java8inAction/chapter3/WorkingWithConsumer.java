package java8inAction.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java8inAction.chapter3.CONSTANTS.arrayListInteger;

/**
 * Created by Asus x556 on 11-Mar-17.
 */
public class WorkingWithConsumer {
    public static <T>void forEach(List<T> list,Consumer c){
        for(T i:list){
            c.accept(i);
        }
    }
    public static void main(String[]args){
        forEach(arrayListInteger, new Consumer<Integer>() {
                    @Override
                    public void accept(Integer t) {
                        if(t%2==0){
                            System.out.println(t);
                        }
                    }
                }
        );
        ///or
        forEach(arrayListInteger, x ->{
                if(x instanceof Integer){
                    int xInt = (int) x;
                    if(xInt %2 ==0){
                        System.out.println(x);
                    }
                }
        });

        forEach(arrayListInteger, x ->{
                if((int)x % 2 ==0){
                    System.out.println(x);
                }
            }
        );

    }
}
