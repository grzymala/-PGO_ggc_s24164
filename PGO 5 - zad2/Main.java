package zad2;

public class Main {
    public static void main(String[] args) {
        Eliksir e1 = new Eliksir("E1", new Liquid("L1", 15, 50));
        Root r1 = new Root("R1", 45, 15);
        Flower f1 = new Flower("F1", 15, 55);
        Ore o1 = new Ore("O1", 100, true, 123);
        Crystal c1 = new Crystal("C1", 45, 15, 11);
        e1.addIngredient(r1);
        e1.addIngredient(f1);
        e1.addIngredient(o1);
        e1.addIngredient(c1);
        e1.create();
        System.out.println(e1);
    }
}
