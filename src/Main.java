import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        // Ошибка компиляции. <Integer> теряестся во воремя рантайма
//    if(integerList instanceof List<Integer>){}


        // А вот так норм
        if (integerList instanceof List) { }

    }
}
