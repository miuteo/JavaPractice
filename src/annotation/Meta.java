package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Asus x556 on 13-Nov-16.
 */
public class Meta {
    @MyAnno(str="Annotation Example",val=10)
    public static void main(String[] args){
        Class<?> c = Meta.class;
        try {
            Method method = c.getMethod("main",String[].class);
            MyAnno anno = method.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " +anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("method main not found");
        }
    }
}
