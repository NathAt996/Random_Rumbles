package Colorable;

public class Circle implements Colorable_Interface{
    
    private String name; 
    private double radius; 
    
    public Circle (String name, double radius) {
        this.name = name; 
        this.radius = radius; 
    }
    
    String getName() {
        return name; 
    }
    
    double getRadius() {
        return radius; 
    }
    
    @Override
    public void howToColor() {
        System.out.println("To shade within this " + name + " ensure to not shade beyond an area of " + area());
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }
}
