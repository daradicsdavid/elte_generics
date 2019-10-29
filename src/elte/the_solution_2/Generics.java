package elte.the_solution_2;

import elte.the_solution_2.utils.GenericList;

public class Generics {
    public static void numberGenericList() {
        //Second diamond parameter is unnecessary new GenericList<Integer>(1) => new GenericList<>(1);
        GenericList<Integer> list = new GenericList<Integer>(1);

        list.add(1);

        Integer number = list.get(0);
    }

    public static void stringGenericList() {
        GenericList<String> list = new GenericList<>(1);

        //Produces compile time error!
//        list.add(1);

        //Produces compile time error!
//        Integer number = list.get(0);
    }
}
