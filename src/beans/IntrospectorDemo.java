package beans;

import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import beans.Colors;
/**
 * Created by teodor.miu on 15-Nov-16.
 */
public class IntrospectorDemo {
    public static void main(String args[]){
        try{
            Class<?> c = Class.forName("beans.Colors");
//            Class<?> c = Colors.class;
            BeanInfo beanInfo = Introspector.getBeanInfo(c);

            System.out.println("Properties:");
            PropertyDescriptor[] propertyDescriptor = beanInfo.getPropertyDescriptors();
            for(int i=0; i<propertyDescriptor.length; i++){
                System.out.println("\t"+propertyDescriptor[i].getName());
            }

            System.out.println("Events:");
            EventSetDescriptor eventSetDescriptor[] = beanInfo.getEventSetDescriptors();
            for(int i=0;i< eventSetDescriptor.length;i++){
                System.out.println("\t"+eventSetDescriptor[i].getName());
            }
        }
        catch (Exception e){
            System.out.println("Exception caught. " + e);
            e.printStackTrace();
        }
    }
}
