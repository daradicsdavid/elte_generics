package elte.the_problem_1.utils;

public class NumberNaiveList extends NaiveList {

    public NumberNaiveList(Integer size) {
        super(size);
    }

    @Override
    public Integer get(Integer i) {
        return (Integer) super.get(i);
    }
}
