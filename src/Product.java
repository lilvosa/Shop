public class Product implements PriceCalculator {
private int quantity;
private double price;
public Product(int quantity,double price) {
    this.quantity=quantity;
    this.price=price;
}

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Product{" +
                "quantity=" + quantity +
                ", price=" + price +
                '}';
    }
    @Override
    public double calculate() {
    return 0;
    }

}
