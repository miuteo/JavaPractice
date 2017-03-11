package java8inAction.chapter3.methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Asus x556 on 11-Mar-17.
 */
public class Main {
    public static void main(String[]args){
        List<String> list = Arrays.asList("za","gfd","gted","sdfhg");
//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        }); or
//        list.sort((a,b)->a.compareTo(b));
        list.sort(String::compareTo);
        System.out.println(list);


    }
}
