package elte.bounding_4.utils;

public class BoundedGenericFunctions {
    public static Integer sum(Integer[] array) {
        Integer sum = 0;
        for (Integer i : array) {
            sum += i;
        }
        return sum;
    }

    public static Short sum(Short[] array) {
        Short sum = 0;
        for (Short i : array) {
            sum = (short) (sum + i);
        }
        return sum;
    }

    public static <T> T sum(T[] array) {
        T sum = null;
        for (T i : array) {
            //Do not know how to add i (which is T) to sum
//            sum += i;
        }
        return sum;
    }

    public static <T extends Number> T sum(T[] array) {
        Double sum = 0.;
        for (T i : array) {
            sum += i.doubleValue();
        }
        return (T) sum;
    }
}
