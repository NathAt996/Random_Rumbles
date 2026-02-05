package Generic_Classes;

public class MyClass <T> {
    T obj;

    MyClass(T obj) {
        this.obj = obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    void showType() {
        System.out.println(obj.getClass().getName());
    }

    @Override
    public String toString() {
        return "Value: " + obj.toString();
    }
}
