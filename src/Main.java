import java.io.Serializable;

public class Main {

    public static void main(String[] args) {
        One one = new One<>(new Job());
        one.myMethod();
    }

}

class Job implements Serializable {
    void printJob() {
        System.out.println("job");
    }
}


//  Добавляем интерфейсы
class One<T extends Job & Serializable> {
    One(T t) {
        this.t = t;
    }

    private T t;

    public void myMethod() {
        t.printJob();
    }

}










