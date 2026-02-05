package Generic_Classes;

public class Main {

    public static void main(String[] args) {

        MyClass<Integer> obj = new MyClass<>(22);
        MyClass<Double> obj2 = new MyClass<>(22.2);

        obj.showType();
        obj.setObj(22);
        obj.getObj();
        System.out.println(obj);

        obj2.showType();
        obj2.setObj(33.1);
        obj2.getObj();
        System.out.println(obj2);

    }
}
