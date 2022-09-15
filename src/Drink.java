import java.util.Objects;

public class Drink extends Product implements PriceCalculator {
    private String brand;
    private boolean softDrink;
    public Drink(int quantity, double price,String brand,boolean softDrink) {
        super(quantity, price);
        this.brand=brand;
        this.softDrink=softDrink;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isSoftDrink() {
        return softDrink;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "brand='" + brand + '\'' +
                ", softDrink=" + softDrink +
                '}';
    }
@Override
public boolean equals(Object drink) {
    Drink other = (Drink) drink;
    return (this.brand.equals(other.brand) &&
            this.softDrink == other.softDrink);
}
@Override
    public double calculate(){
        if (!softDrink){
            return this.getPrice() + 3.5;
        }
        else{
            return this.getPrice() + this.getPrice()*0.1;
        }
}
}

