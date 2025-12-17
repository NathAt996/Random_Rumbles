package Colorable;

public class Triangle implements Colorable_Interface{

    private String name;
    private double base;
    private double height;

    public Triangle (String name, double base, double height) {
        this.name = name;
        this.base = base;
        this.height = height;
    }

    String getName() {
        return name;
    }

    @Override
    public void howToColor() {
        System.out.println("To shade within this " + name + " ensure to not shade beyond an area of " + area());
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }
}
