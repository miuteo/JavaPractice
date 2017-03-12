package java8inAction.chapter3.methodReference;

/**
 * Created by Asus x556 on 12-Mar-17.
 */
@FunctionalInterface
public interface TriFunction<T ,U ,X,Y> {
    Y apply(T t,U u,X x);
}
