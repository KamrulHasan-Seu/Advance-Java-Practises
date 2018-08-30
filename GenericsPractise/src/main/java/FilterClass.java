import java.util.List;

public interface FilterClass<T> {
    boolean test(T t);
    T check(T t);
}
