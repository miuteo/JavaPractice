package annotation;

import java.lang.reflect.Method;

/**
 * Created by Asus x556 on 13-Nov-16.
 */
public class Meta3 {
    @MyAnno
    public static void main(String[]args){
        Class c = Meta3.class;
        try {
            Method mainMethod = c.getMethod("main",String[].class);
            MyAnno myAnno = mainMethod.getAnnotation(MyAnno.class);
            System.out.println(myAnno.str()+" "+myAnno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("mainMethod not found");
        }

    }
}
