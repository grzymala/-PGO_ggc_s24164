package zad1;

public class Figure {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    protected double getArea() {
        return 0;
    }

    protected double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return name + ": obwód: " + this.getPerimeter() + "; powierzchnia: " + this.getArea();
    }
}
