package elte.wildcards_5;

import elte.bounding_4.utils.BoundedGenericFunctions;
import elte.generic_methods_3.utils.BagOfGenericMethods;
import elte.the_solution_2.utils.GenericList;

public class Generics {

    public static void problem_1() {
        GenericList genericList = new GenericList(2);
        genericList.add(1);
        genericList.add(2);

        //Throws compilation error, we cannot add Objects.
//        int i = genericList.get(0) + genericList.get(1);
    }

    public static void solution_1() {
        GenericList<Integer> genericList = new GenericList<>(2);
        genericList.add(1);
        genericList.add(2);

        int i = genericList.get(0) + genericList.get(1);
    }

    public static void problem_2() {
        GenericList<Double> genericList = new GenericList<>(2);
        genericList.add(1.);
        genericList.add(2.1);
        //Compile time error! GenericList<Double> is not GenericList<Number>
//        numberSum(genericList, 2);
    }

    private static Number numberSum(GenericList<Number> numbers, Integer size) {
        Integer sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers.get(i).intValue();
        }
        return sum;
    }

    public static void solution_2() {
        GenericList<Double> genericList = new GenericList<>(2);
        genericList.add(1.);
        genericList.add(2.1);
        //Compiles!
        genericSum(genericList, 2);
    }


    private static Number genericSum(GenericList<? extends Number> numbers, Integer size) {
        Integer sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers.get(i).intValue();
        }
        return sum;
    }

}
