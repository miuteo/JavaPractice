package designPatterns.creational.singleton;

import java.io.Serializable;

/**
 * Created by Asus x556 on 31-May-17.
 */
public class SerializedSingleton implements Serializable{
    private static final long serialVersionUID = -7604766932017737115L;
    private SerializedSingleton(){}

    private static class SingletonHelper{
        private final static SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return  SingletonHelper.INSTANCE;
    }
    public Object readResolve()
    {
        return getInstance();
    }

}
