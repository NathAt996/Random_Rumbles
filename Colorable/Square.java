package Colorable;

public class Square implements Colorable_Interface{

    private String name;
    private double length;
    private double width;

    public Square (String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
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
        return length * width;
    }
}
