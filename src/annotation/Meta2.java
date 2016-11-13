package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Asus x556 on 13-Nov-16.
 */
@What(description = "An annotation test class")
@MyAnno(str = "Meta2",val = 99)
public class Meta2 {
    @What(description = "An annotation test method")
    @MyAnno(str = "Testing", val=100)
    public static void main(String[] args){
        Class c = Meta2.class;
        Annotation[] classAnnotations = c.getAnnotations();

        System.out.println("All annotations for Meta2:");
        for(Annotation x : classAnnotations){
            System.out.println(x);
        }
        System.out.println();
        try {
            Method mainMethod = c.getMethod("main",String[].class);
            Annotation[] methodAnnotations = mainMethod.getAnnotations();
            System.out.println("All annotation for main method");
            for (Annotation x: methodAnnotations) {
                System.out.println(x);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Main method not found");
        }

    }
}
