package elte.generic_methods_3;

import elte.generic_methods_3.utils.BagOfGenericMethods;

public class Generics {

    public void testField() {
        Object o1 = BagOfGenericMethods.throwItBack(1);
        Integer o2 = BagOfGenericMethods.throwItBack(1);

        String string = BagOfGenericMethods.throwItBack("String");
    }

}
