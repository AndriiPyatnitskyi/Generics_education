public class Main {

    public static void main(String[] args) {
        //  Создал типизированный по Integer объект типа MyGeneric.
        MyGeneric<Integer> myGeneric = new MyGeneric<>();
        myGeneric.setT(1);
        System.out.println(myGeneric.getT());

        //  Создал не типизированный объект типа MyGeneric,
        //  теперь могу туда ложить что угодно
        MyGeneric myGenericUntyped = new MyGeneric();
        myGenericUntyped.setT(new Object());
        System.out.println(myGenericUntyped.getT());
    }
}
