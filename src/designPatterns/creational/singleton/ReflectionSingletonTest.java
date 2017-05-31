package designPatterns.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * Created by Asus x556 on 31-May-17.
 */
public class ReflectionSingletonTest {
    public static void main(String[]args){
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getEagerInitializedSingleton();
        EagerInitializedSingleton instance2 = null;

        try{
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            System.out.println(constructors.length);
            for(Constructor constructor:constructors){
                constructor.setAccessible(true);
                instance2 = (EagerInitializedSingleton)constructor.newInstance();
                break;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
