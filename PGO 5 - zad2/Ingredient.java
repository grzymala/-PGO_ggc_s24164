package zad2;

import java.util.Objects;

public abstract class Ingredient {
    protected String name;
    protected int baseReagent;

    public Ingredient(String name, int baseReagent) {
        this.name = name;
        this.baseReagent = baseReagent;
    }

    protected abstract int getReagent();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return baseReagent == that.baseReagent &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, baseReagent);
    }
}
