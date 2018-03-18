import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<String>();
        //  Ниже ошибка компиляции.
//          List<Object> listObjects = listStrings;
        //  Поскольку так сделать не получится
        //  listObjects.add(new Object());
        //  String s = listStrings.get(0);

    }
}










