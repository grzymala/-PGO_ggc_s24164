package zad2;

import java.util.ArrayList;

public class Eliksir {
    private String name;
    private boolean isCreated;
    private int power;
    private Liquid catalyst;
    ArrayList<Ingredient> ingredients = new ArrayList<>();

    public Eliksir(String name, Liquid catalyst) {
        this.name = name;
        this.catalyst = catalyst;
    }

    public void addIngredient(Ingredient ingredient) {
        if(!isCreated) {
            ingredients.add(ingredient);
        }
    }

    public void removeIngredient(Ingredient ingredient) {
        if(!isCreated) {
            ingredients.remove(ingredient);
        }
    }

    public void create() {
        this.isCreated = true;
        for(Ingredient i : this.ingredients) {
            this.power += i.getReagent();
        }
        this.power /= catalyst.baseReagent;
    }

    @Override
    public String toString() {
        return "Eliksir{" +
                "name='" + name + '\'' +
                ", isCreated=" + isCreated +
                ", power=" + power +
                ", catalyst=" + catalyst +
                ", ingredients=" + ingredients +
                '}';
    }
}
