package elte.the_solution_2.utils;

public class GenericList<T> {
    private final T[] elements;
    private int i;

    public GenericList(Integer size) {
        this.elements = (T[]) new Object[size];
        i = 0;
    }

    public void add(T object) {
        elements[i] = object;
        i++;
    }

    public T get(Integer i) {
        return elements[i];
    }

}
