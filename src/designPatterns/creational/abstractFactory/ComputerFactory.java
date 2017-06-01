package designPatterns.creational.abstractFactory;

/**
 * Created by Asus x556 on 01-Jun-17.
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }

}
