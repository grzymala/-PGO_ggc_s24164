import java.util.ArrayList;

public class ShoppingCart {
    final int id;
    static int counter = 0;
    ArrayList<Products> lista;
    double totalPrice;
    double totalDelivery;

    void sell(){
        for(Products p : lista){
            p.sell();
        }
    }

    public ShoppingCart(ArrayList<Products> lista) {
        id = counter++;
        this.lista = lista;
        for(Products p : lista){
            if(p.isAvailable){
                totalPrice += p.price;
            }
        }
    }
}
