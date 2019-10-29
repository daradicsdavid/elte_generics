package elte.the_problem_1;

import elte.the_problem_1.utils.NaiveList;
import elte.the_problem_1.utils.NumberNaiveList;
import elte.the_problem_1.utils.StringNaiveList;

//Why we need them
public class Generics {
    public static void naiveList() {
        NaiveList list = new NaiveList(1);

        list.add(1);

        //We already know it is a number
        Integer number = (Integer) list.get(0);
    }

    public static void numberNaiveList() {
        NumberNaiveList list = new NumberNaiveList(1);

        list.add(1);

        Integer number = list.get(0);
    }

    public static void stringNaiveList() {
        StringNaiveList list = new StringNaiveList(1);

        //It accepts one as a valid 'String'
        list.add(1);

        //Throws ClassCastException because it cannot cast an Integer as a String
        String word = list.get(0);
    }
}
