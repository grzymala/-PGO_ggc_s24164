package zad2;

public class Root extends Plant {
    public Root(String name, int baseReagent, int toxicity) {
        super(name, baseReagent, toxicity);
    }

    @Override
    protected int getReagent() {
        return super.getReagent() / 2;
    }
}
