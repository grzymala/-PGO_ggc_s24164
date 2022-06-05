package zad2;

public class Ore extends Mineral {
    protected boolean metallic;

    public Ore(String name, int baseReagent, boolean metallic, int power) {
        super(name, baseReagent,power);
        this.metallic = metallic;
    }

    @Override
    protected int getReagent() {
        return super.getReagent() / (metallic ? 1 : 2);
    }
}
