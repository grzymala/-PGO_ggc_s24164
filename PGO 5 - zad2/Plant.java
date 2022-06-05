package zad2;

public class Plant extends Ingredient {
    protected int toxicity;

    public Plant(String name, int baseReagent, int toxicity) {
        super(name, baseReagent);
        this.toxicity = toxicity;
    }

    @Override
    protected int getReagent() {
        return super.baseReagent * toxicity;
    }
}
