package designPatterns.creational.factory;

/**
 * Created by Asus x556 on 01-Jun-17.
 */

interface Computer {

     String getRAM();
     String getHDD();
     String getCPU();

//    @Override
    default String toString2() {
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}