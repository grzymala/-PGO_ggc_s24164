package zad2;

public class Mineral extends Ingredient {
    protected int power;

    public Mineral(String name, int baseReagent, int power) {
        super(name, baseReagent);
        this.power = power;
    }

    @Override
    protected int getReagent() {
        return super.baseReagent + power;
    }
}
