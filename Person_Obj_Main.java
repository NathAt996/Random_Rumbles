public class Person_Obj_Main {

    public static void main(String[] args) {

        Person_Obj person = new Person_Obj();
        Person_Obj person2 = new Person_Obj();
        Person_Obj person3 = new Person_Obj();

        person.setName("Heinrich");
        person.setAge(32);
        person.setHeight(180.32);

        person2.setName("Muhammad");
        person2.setAge(24);
        person2.setHeight(181.12);

        person3.setName("Llewellyn");
        person3.setAge(29);
        person3.setHeight(177.43);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Height: " + person.getHeight() + "cm");

        System.out.println("\nName: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Height: " + person2.getHeight() + "cm");

        System.out.println("\nName: " + person3.getName());
        System.out.println("Age: " + person3.getAge());
        System.out.println("Height: " + person3.getHeight() + "cm");

    }
}
