enum ProductType{
    Consumable, Entertainment, Electronic
}
public class Products {
    String name;
    ProductType productType;
    double price;
    int quantity;
    boolean isAvailable = false;

    void sell(){
        quantity -= 1;
    }

    int increaseQuantity(int addedQuantity){
        return quantity += addedQuantity;
    }

    public Products(String name, ProductType productType, double price, int quantity) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
        if (quantity > 0) isAvailable = true;
    }
}
