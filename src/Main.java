public class Main {
    //  Используем GenericClass без дженериков
    //  Опасно!!!
    static <T> void add(GenericClass<T> genericClass) {
        genericClass.setT((T) "qwerty");
    }

    public static void main(String[] args) {
        GenericClass<Integer> genericClass = new GenericClass();
        add(genericClass);
        // ClassCastException
        Integer integer = genericClass.getT();
    }

}

class GenericClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}










