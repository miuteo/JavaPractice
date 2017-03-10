package java8inAction.chapter3;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Asus x556 on 09-Mar-17.
 */
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader b) throws IOException;
}
