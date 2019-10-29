package elte.the_problem_1.utils;

public class NaiveList {

    protected final Object[] elements;
    protected int i;

    public NaiveList(Integer size) {
        this.elements = new Object[size];
        i = 0;
    }

    public void add(Object object) {
        elements[i] = object;
        i++;
    }

    public Object get(Integer i) {
        return elements[i];
    }


}
