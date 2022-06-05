package zad1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figure> figury = new ArrayList<>();
        figury.add(new Figure("Figure A"));
        figury.add(new Rectangle("Rectangle A", 10, 4));
        figury.add(new Sphere("Sphere A", 2));
        figury.add(new Rectangle("Rectangle B", 2, 3));
        figury.add(new Sphere("Sphere B", 9));
        figury.add(new Rectangle("Rectangle C", 9, 10));

        System.out.println("Figures:");
        for(Figure f : figury) {
            System.out.println(f);
        }
    }
}
