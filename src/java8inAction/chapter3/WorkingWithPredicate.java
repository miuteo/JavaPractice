package java8inAction.chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by teodor.miu on 10-Mar-17.
 */
public class WorkingWithPredicate {
    public static <T> List <T> filter(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<T>();
        for(T i:list){
            if(predicate.test(i))
                result.add(i);
        }
        return result;
    }
    public static void main(String[]args){
        List<String> lista = new ArrayList<>();
        lista.add("abc");
        lista.add("ab");
        lista.add("bca");
        lista.add("cab");

        System.out.println( filter(lista,cuv -> cuv.startsWith("a")));
    }
}
