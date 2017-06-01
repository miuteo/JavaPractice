package designPatterns.creational.builder;

/**
 * Created by Asus x556 on 01-Jun-17.
 */
public class TestBuilderPattern {
    public static void main(String[]args){
        Computer comp = new Computer.ComputerBuilder("500 GB","2 GB")
                .setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
    }
}
