package javaForImpatient.localInnerClasses.exercises;

import java.lang.reflect.Array;
import java.util.Collection;

/**
 * Created by Ionela on 1/29/2017.
 */
public class Employee implements Measurable{
    String name;
    double salary;
    @Override
    public double getMeasure() {
        return salary;
    }
    public double average(Measurable[] objects){
        double sum = 0;
        for(Measurable ob:objects){
            sum+=ob.getMeasure();
        }
        return sum/objects.length;
    }
}
