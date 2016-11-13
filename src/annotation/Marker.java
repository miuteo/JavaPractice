package annotation;

import java.lang.reflect.Method;

/**
 * Created by Asus x556 on 13-Nov-16.
 */
public class Marker {
    @MyMarker
    public static void main(String[] args){
        Class c = Marker.class;
        try {
            Method mainMethod = c.getMethod("main",String[].class);
            if(mainMethod.isAnnotationPresent(MyMarker.class)){
                System.out.println("MyMarker is present");
            }else{
                System.out.println("MyMarker is not present");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("main method not found");
        }
    }
}
