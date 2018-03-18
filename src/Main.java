import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //  Не скомпилируется
//        List<Number> intList = new ArrayList<Integer>();

        //  А так скомпилируется
        List<?> intList = new ArrayList<Integer>();

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);
        List<String> strList = new ArrayList<>();
        strList.add("10");
        strList.add("100");
        printList(strList);


        //  Однако вот это не скомпилируется:
//        List<?> intList = new ArrayList<Integer>();
//        intList.add(new Integer(10));
        /* intList.add(new Float(10.0f)); даже с закомментированной последней строкой не скомпилируется */

        //  Тут не возникнет проблем компиляции. Однако нехорошо,
        //  что переменная numList хранит список со строками.
        //  Допустим нам нужно так объявить эту переменную,
        //  чтобы она хранила только списки чисел.
        List<?> numList1 = new ArrayList<Integer>();
        numList1 = new ArrayList<String>();


        List<? extends Number> numList = new ArrayList<Integer>();
        //  Не компилится
        //  всё из-за того, что с помощью маски мы задали ограничение
//        numList = new ArrayList<String>();

        //  А тут норм
        numList = new ArrayList<Double>();

        List<? super Number> numberList1 = new ArrayList<>();






    }

    List<? super Number> listCopy(List<? extends Number> givenList, List<? super Number> resultList){
        for (Number number : givenList) {
            resultList.add(number);
        }
        return resultList;
    }


    //  Этот метод работает для списков с различными типами данных
    //  (в примере Integer и String).
    static void printList(List<?> list) {
        for (Object l : list)
            System.out.println("{" + l + "}");
    }
}
