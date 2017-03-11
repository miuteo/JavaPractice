package java8inAction.chapter3;

/**
 * Created by Asus x556 on 11-Mar-17.
 */
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
