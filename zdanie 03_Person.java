import java.util.ArrayList;

public class Person {
    String name;
    String surname;
    double moneyInCash;
    double moneyOnCard;
    ArrayList<ShoppingCart> historia = new ArrayList<>();

    ShoppingCart makeOrder(){
        ArrayList<Products> produkty = new ArrayList<>();
        return new ShoppingCart(produkty);
    }

    void buyByCard(ShoppingCart koszyk){
        if(koszyk.totalPrice <= moneyOnCard){
            moneyOnCard -= koszyk.totalPrice;
            historia.add(koszyk);
        }
    }

    void buyInCash(ShoppingCart koszyk){
        if(koszyk.totalPrice <= moneyInCash){
            moneyInCash -= koszyk.totalPrice;
            historia.add(koszyk);
        }
    }

    public Person(String name, String surname, double moneyInCash, double moneyOnCard) {
        this.name = name;
        this.surname = surname;
        this.moneyInCash = moneyInCash;
        this.moneyOnCard = moneyOnCard;
    }
}
