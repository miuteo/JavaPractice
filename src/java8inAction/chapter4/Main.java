package java8inAction.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Asus x556 on 12-Mar-17.
 */
public class Main {
    public static List<Dish> dishList;
    static{
        dishList= Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("french fries",true,530,Type.OTHER),
                new Dish("season fruit",true,120,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );
    }
    public static void main(String[]args){
        List<String> top3HighCaloricDishNames = dishList.stream()
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .limit(3).collect(Collectors.toList());
//        System.out.println(top3HighCaloricDishNames);

        List<String> threeHighCaloricDishName = dishList.stream()
                .filter(d ->{
                    System.out.println("filter "+d.getName());
                    return d.getCalories()>300;
                })
                .map(d->{
                    System.out.println("map "+d.getName());
                    return d.getName();
                }).limit(5).collect(Collectors.toList());
        System.out.println("result="+threeHighCaloricDishName);

        List<String> words = Arrays.asList("Java8","Lambdas","In","Action");
        List<Integer> wordLength = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

//        Stream<String> wordsStream1= words.stream();
        Stream<String> wordsStream2= words.stream();
//        Stream<String[]> wordsStreamSplit1 = wordsStream1.map(x -> x.split(""));
        Stream<String[]> wordsStreamSplit2 = wordsStream2.map(x -> x.split(""));

//        Stream<Stream<String>> map = wordsStreamSplit1.map(Arrays::stream);
        Stream<String> flatMap =wordsStreamSplit2.flatMap(Arrays::stream);
//        Stream<String> flatMap2 =wordsStreamSplit2.flatMap(a-> Arrays.stream(a));


//        wordsStreamSplit.map(Arrays::stream);
//        wordsStreamSplit.flatMap(Arrays::stream);



//  <R> Stream<R>	flatMap(Function<? super T,? extends Stream<? extends R>> mapper)
//  <R> Stream<R>	map(Function<? super T,    ? extends R> mapper)
//     map        X super T     (R extends Y)==Stream<Stream<String>>
//  flatMap      X super T     R extends Stream<Z extends Y>
//    <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);

//
//                map(word->word.split(""))
//                .map(Arrays::stream);
//                .distinct()
//                .collect(Collectors.toList());
        //<R> Stream<R> map(Function<? super T, ? extends R> mapper);
        //<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);

        List<String> distinctWords = flatMap.distinct().collect(Collectors.toList());
        System.out.println(distinctWords);

    }

}
