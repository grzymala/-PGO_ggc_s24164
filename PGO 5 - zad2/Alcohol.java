package zad2;

public class Alcohol extends Liquid {
    int percent;

    public Alcohol(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent, dissolubility);
    }

    @Override
    protected int getReagent() {
        return super.getReagent() * percent/100;
    }
}
