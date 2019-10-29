package elte.bounding_4;

import elte.bounding_4.utils.BoundedGenericFunctions;

import java.util.Arrays;

public class Generics {

    public static void fieldTest() {
        Integer integerSum = BoundedGenericFunctions.sum(new Integer[]{1, 2, 3});
        Short shortSum = BoundedGenericFunctions.sum(new Short[]{1, 2, 3});

        Double doubleSum =BoundedGenericFunctions.sum(new Double[]{1., 2., 3.});
    }
}
