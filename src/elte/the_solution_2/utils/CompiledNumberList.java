package elte.the_solution_2.utils;


public class CompiledNumberList {
    protected final Integer[] elements;
    protected int i;

    public CompiledNumberList(Integer size) {
        this.elements = new Integer[size];
        i = 0;
    }

    public void add(Integer object) {
        elements[i] = object;
        i++;
    }

    public Integer get(Integer i) {
        return elements[i];
    }

}
