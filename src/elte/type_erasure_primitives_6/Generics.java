package elte.type_erasure_primitives_6;

import elte.the_solution_2.utils.GenericList;

public class Generics {

    public <T> T genericMethod(T generic) {
        return generic;
    }

    //Compiles to:
//    public Object genericMethod(Object generic) {
//        return generic;
//    }


    public <T extends Number> T genericMethod(T generic) {
        return generic;
    }

    //Compiles to:
//    public Number genericMethod(Number generic) {
//        return generic;
//    }

    public void primitives() {
        //Compile time error! Primitives are not Objects!
//        GenericList<int> genericList = new GenericList<int>();
    }
}
