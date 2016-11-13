package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Asus x556 on 13-Nov-16.
 */
public class Single {
    @MySingle(500)
    public static void main(String[] args){
        Class c =Single.class;
        try {
            Method m = c.getMethod("main",String[].class);
            MySingle annotation = m.getAnnotation(MySingle.class);
            System.out.println(annotation.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
