import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<Object>();

// T inferred to be Object
        fromArrayToCollection(oa, co);

        String[] stringArray = new String[100];
        Collection<String> stringCollection = new ArrayList<>();

// T inferred to be String
        fromArrayToCollection(stringArray, stringCollection);

// T inferred to be Object
        fromArrayToCollection(stringArray, co);

        Integer[] integerArray = new Integer[100];
        Float[] floatArray = new Float[100];
        Number[] numberArray = new Number[100];
        Collection<Number> numberCollection = new ArrayList<>();

// T inferred to be Number
        fromArrayToCollection(integerArray , numberCollection);

// T inferred to be Number
        fromArrayToCollection(floatArray, numberCollection);

// T inferred to be Number
        fromArrayToCollection(numberArray, numberCollection);

// T inferred to be Object
        fromArrayToCollection(numberArray, co);

// compile-time error
        fromArrayToCollection(numberArray, stringCollection);
    }

    static <T> void fromArrayToCollection(T[] array, Collection<T> collection) {
        for (T object : array) {
            collection.add(object); // Correct
        }
    }
}










