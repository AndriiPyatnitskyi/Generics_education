import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> numberList= new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        //  Ошибка компиляции
//        numberList = integerList;

        Number[] numbers = new Number[100];
        Integer[] integers = new Integer[10];
        integers[0] = 1;
        integers[1] = 2;
        numbers = integers;
        // Тут программа свалится с ArrayStoreException
        numbers[1] = 0.01;
        for (Number number : numbers) {
            System.out.println(number);
        }
    }
}
