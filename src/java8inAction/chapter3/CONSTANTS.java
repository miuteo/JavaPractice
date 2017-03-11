package java8inAction.chapter3;

import java.util.ArrayList;

/**
 * Created by Asus x556 on 11-Mar-17.
 */
public class CONSTANTS {
    public final static ArrayList<Integer> arrayListInteger;
    public final static ArrayList<String> arrayListString;
    static{
        arrayListInteger = new ArrayList<>();
        arrayListInteger.add(1);
        arrayListInteger.add(2);
        arrayListInteger.add(3);
        arrayListInteger.add(4);
        arrayListInteger.add(5);
        arrayListInteger.add(6);

        arrayListString = new ArrayList<>();
        arrayListString.add("a");
        arrayListString.add("ab");
        arrayListString.add("abc");
        arrayListString.add("aa");
        arrayListString.add("aax");
        arrayListString.add("ba");
        arrayListString.add("bb");
        arrayListString.add("bbb");
    }
}
