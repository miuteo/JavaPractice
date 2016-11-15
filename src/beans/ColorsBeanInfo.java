package beans;

import java.awt.*;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 * Created by teodor.miu on 15-Nov-16.
 */
public class ColorsBeanInfo extends SimpleBeanInfo{
    public PropertyDescriptor[] getPropertyDescriptors(){
        try{
            PropertyDescriptor rectangular =
                    new PropertyDescriptor("rectangular", Colors.class);
            PropertyDescriptor pd[] = {rectangular};
            return  pd;
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        return null;
    }
}
