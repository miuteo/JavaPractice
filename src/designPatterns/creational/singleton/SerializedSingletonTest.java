package designPatterns.creational.singleton;

import java.io.*;

/**
 * Created by Asus x556 on 31-May-17.
 */
public class SerializedSingletonTest {
    public static void main(String[]args) throws FileNotFoundException, IOException, ClassNotFoundException{
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        new File("filename.ser").delete();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
    }
}
