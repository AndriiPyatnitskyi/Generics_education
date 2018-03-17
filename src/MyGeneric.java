public class MyGeneric<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}


//  После компиляции верхнего класса вся информация про дженерики пропадает
//  Это связано с обратной совместимостью старого кода до 1.5 версии джава

//public class MyGeneric {
//    private Object object;
//
//    public Object getObject() {
//        return object;
//    }
//
//    public void setObject(Object object) {
//        this.object = object;
//    }
//}
