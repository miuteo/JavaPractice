package designPatterns.creational.singleton;

/**
 * Created by Asus x556 on 31-May-17.
 */
public class EagerInitializedSingleton {
    private static EagerInitializedSingleton instance = new EagerInitializedSingleton();
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){

    }

    public static EagerInitializedSingleton getEagerInitializedSingleton(){
        return instance;
    }


}
