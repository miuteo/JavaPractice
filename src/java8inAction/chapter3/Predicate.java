package java8inAction.chapter3;

import java.util.List;

/**
 * Created by teodor.miu on 10-Mar-17.
 */
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}

