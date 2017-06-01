package designPatterns.creational.factory;

/**
 * Created by Asus x556 on 01-Jun-17.
 */
public class FactoryTest {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc.toString2());
        System.out.println("Factory Server Config::"+server.toString2());
    }

}