package filter;

import model.Person;

@FunctionalInterface
public interface Filter<T> {
    boolean test(T t);

    default public void fest() {
        System.out.println("Nothing Happened");
    }


}
