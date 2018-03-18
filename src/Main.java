public class Main {

    public static void main(String[] args) {
        One one = new One<>(new Job());
        one.myMethod();

        //  Так же в качестве Job у нас его подтип SubJob
        One one1 = new One<>(new SubJob());
        one1.myMethod();
    }

}

class Job {
    void printJob() {
        System.out.println("job");
    }
}

class SubJob extends Job{
    void printJob() {
        System.out.println("sub job");
    }
}

//  Расширяем поведение для переменной t,
//  после установки дженерика <T extends Job> у t появился новый метод
class One<T extends Job> {
    One(T t) {
        this.t = t;
    }

    private T t;

    public void myMethod() {
        t.printJob();
    }

}










