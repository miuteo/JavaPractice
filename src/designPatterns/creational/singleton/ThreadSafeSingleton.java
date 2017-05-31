package designPatterns.creational.singleton;

/**
 * Created by Asus x556 on 31-May-17.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){

    }

    public static ThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance==null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
    public static synchronized ThreadSafeSingleton getInstanceCostly(){
        if(instance == null){
           instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}
