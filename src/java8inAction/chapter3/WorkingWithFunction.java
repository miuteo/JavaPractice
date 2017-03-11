package java8inAction.chapter3;

import java.util.ArrayList;
import java.util.List;
import static java8inAction.chapter3.CONSTANTS.arrayListString;

/**
 * Created by Asus x556 on 11-Mar-17.
 */
public class WorkingWithFunction {
    public static <T,R> List<R> map(List<T> list,Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T i:list){
            result.add(function.apply(i));
        }
        return result;
    }
    public static void main(String[]args){
        List<Integer> result1 = map(arrayListString, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });
        List<Integer> result = map(arrayListString,s ->s.length());
        System.out.println(result);
        System.out.println(result1);
    }
}
