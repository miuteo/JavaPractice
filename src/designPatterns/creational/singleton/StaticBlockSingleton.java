package designPatterns.creational.singleton;

/**
 * Created by Asus x556 on 31-May-17.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton staticBlockSingleton;

    static{
        try{
                staticBlockSingleton = new StaticBlockSingleton();
        }catch (RuntimeException e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    private StaticBlockSingleton(){

    }

    public static StaticBlockSingleton getInstance(){
        return staticBlockSingleton;
    }

}
