public class Main {

    public static void main(String[] args) {
    }
}

class Parent {
}


//  Делаем дженерик наследника от недженерик родителя
class Child1<T> extends Parent {
}


//  Делаем недженерик наследника от дженерик родителя
class Child2 extends Child1 {
}


//  Делаем наследника от дженерик родителя
//  Ошибка компиляции.
//class Child3 extends Child1<T>{}


// Поправить это можно если указать у наследника то же тип что и у родителя
class Child3<T> extends Child1<T> {
}


//  Или указать конкретный тип у дженерик родителя
class Child4 extends Child1<String> {
}


//  Ошибка компиляции, в наследнике не указан тип из родителя, однако добавлен новый
//class Child5<X> extends Child1<T>{}


//  Здесь в наследнике указан тип из родителя и добавлен новый
class Child5<X, T> extends Child1<T> {
}


//  Либо в родителе указываем конкретный тип,
//  который переходит в наследника
class Child6<X, String> extends Child1<String> {
}


//  Можно переназвать дженерик тип другой буквой,
//  отличной от той, что была в обявлении родительского класса
class Child7<Y> extends Child1<Y> {
}


//  Убрали у дженерик додителя тип,
//  а наследнику добавили новых 3
class Child8<X, Y, Z> extends Child1 {
}


//  Указали точные типы у родителя  не точные у наследника
//  Пока не понятно какой в этом смысл,
//  поскольку мы можем создать объкт так:
//  Child9<Object, Object, Object> child9 = new Child9<>();
class Child9<X, Y, Z> extends Child8<String, Y, Integer> {
}


//  Обьявляем интерфейс с дженерником
interface GenericInterface<T> {
    T getT();
}


//  Имплементируем интерфейс без дженерика
//  При этом класс думает что метод getT() для типа Object
class One implements GenericInterface {
    @Override
    public Object getT() {
        return null;
    }
}


//  Имплементируем интерфейс с дженериком
//  Тут уже класс думает что метод getT() для типа String
class Two implements GenericInterface<String> {
    @Override
    public String getT() {
        return null;
    }
}


//  Имплементируем интерфейс с дженериком неопределеннго типа
//  Класс думает что метод getT() для типа T
class Three<T> implements GenericInterface<T> {
    @Override
    public T getT() {
        return null;
    }
}








