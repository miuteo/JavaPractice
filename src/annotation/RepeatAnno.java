package annotation;

import java.lang.annotation.Annotation;

/**
 * Created by Asus x556 on 13-Nov-16.
 */
@MyAnno()
@MyAnno(val = 100)
@MyAnno(str = "xyz",val=90)
public class RepeatAnno {
    public static void main(String[] args){
        Class c = RepeatAnno.class;
        Annotation myRepeatedAnnos = c.getAnnotation(MyRepeatedAnnos.class);
        System.out.println(myRepeatedAnnos);

        Annotation[] myAnnoArray = c.getAnnotationsByType(MyAnno.class);
        for (Annotation x : myAnnoArray){
            System.out.println(x);
        }
    }
}
