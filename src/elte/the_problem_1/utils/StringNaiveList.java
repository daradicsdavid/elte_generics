package elte.the_problem_1.utils;

public class StringNaiveList extends NaiveList {
    public StringNaiveList(Integer size) {
        super(size);
    }



    @Override
    public String get(Integer i) {
        return (String) super.get(i);
    }
}
