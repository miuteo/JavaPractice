package java8inAction.firstLambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Asus x556 on 09-Mar-17.
 */

public class FirstLambda {
    public static String readFile(BufferedReaderProcessor p) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }catch (Throwable t){
            t.printStackTrace();
            return "error";
        }
    }

    public static void main(String[]args){

            readFile(new BufferedReaderProcessor() {
                @Override
                public String process(BufferedReader b) throws IOException {
                    return null;
                }
            });
            ///or using lambda
            readFile(br -> "");

    }
}
