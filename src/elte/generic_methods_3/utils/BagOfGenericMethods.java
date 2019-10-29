package elte.generic_methods_3.utils;

public class BagOfGenericMethods {

    public static <T> T throwItBack(T object) {
        return object;
    }

    public static <T> T throwItBack(Integer object) {
        return (T) object;
    }

    //This works for classes as well. I.E. public class GenericList<T,E>
    public static <T, E> T throwItBack(T object, E otherObject) {
        return object;
    }

}
