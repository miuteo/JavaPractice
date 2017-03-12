package java8inAction.chapter3.methodReference;

import java8inAction.chapter3.Apple;
//import java8inAction.chapter3;
import java8inAction.chapter3.WorkingWithFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

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
        Function<String,Integer> function = s->Integer.parseInt(s);
        function = Integer::parseInt;
//        List<String> integerString = Arrays.asList("1","2","3");
//        List<Integer> integerParsed = WorkingWithFunction.map(integerString,function);
//        System.out.println(integerParsed);
        BiPredicate<List<String>,String> contains = (li,x) ->li.contains(x);
        BiPredicate<List<String>,String> contains2 = List::contains;

        Supplier<Apple> c1 =Apple::new;//or
//        c1 = () -> new Apple();
        Apple a1 = c1.get();
        System.out.println(a1);

        c1 = new Supplier<Apple>() {
            @Override
            public Apple get() {
                return new Apple(5);
            }
        };
        c1 = () ->new Apple(5);

        Function<Integer,Apple> f1 = Apple::new;
        f1= (x)->new Apple(x);
        a1=f1.apply(5);

        BiFunction<String,Integer,Apple> bf = Apple::new;
        a1 =bf.apply("green",40);
        System.out.println(a1);
        ///equivalent
        BiFunction<String,Integer,Apple> bf2 = (color,weight)-> new Apple(color,weight);
        a1 = bf2.apply("green",40);
        System.out.println(a1);

        BiFunction<String,Integer,Apple>bf3 =new BiFunction<String, Integer, Apple>() {
            @Override
            public Apple apply(String s, Integer integer) {
                return new Apple(s,integer);
            }
        };
        a1=bf3.apply("green",40);
        System.out.println(a1);

        TriFunction<String,Integer,Integer,Apple> tf1 = Apple::new;
        a1=tf1.apply("green",40,1);
        System.out.println(a1);

        List<Apple> listApple = new ArrayList<>();
        listApple.sort(Comparator.comparing((Apple a)->a.getColor()).reversed().thenComparing(Apple::getId));
        listApple.sort(Comparator.comparing(Apple::getColor).reversed().thenComparing(Apple::getId));

        Predicate<Apple> redApple = a -> a.getColor().equals("red");
        Predicate<Apple> notRedApple = redApple.negate();
        Predicate<Apple> redAppleHeavy = redApple.and(a->a.getWeight()>150);

        Function<Integer,Integer> f = x -> x+1;
        Function<Integer,Integer> g = x -> x * 2;
        Function<Integer,Integer> h1 = f.andThen(g);//similar with g(f(x))
        Function<Integer,Integer> h2 = f.compose(g);//similar with f(g(x))

        System.out.println(h1.apply(1));
        System.out.println(h2.apply(1));



    }
}
