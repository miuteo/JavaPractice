package java8inAction.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        List<String> words = Arrays.asList("");
    }

}
