package designPatterns.creational.singleton;

/**
 * Created by Asus x556 on 31-May-17.
 */
public class BillPughSingleton {
    private BillPughSingleton(){
        System.out.println("S-a initializat BillPushSigleton");
    }

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return  SingletonHelper.INSTANCE;
    }
}
