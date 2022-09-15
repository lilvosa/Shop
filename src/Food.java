public class Food extends Product implements PriceCalculator {
    private String type;
    private int daysToExpire;

    public Food(int quantity, double price,String type,int daysToExpire) {
        super(quantity, price);
        this.type=type;
        this.daysToExpire=daysToExpire;
    }

    public String getType() {
        return type;
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food food = (Food) o;
        return getDaysToExpire() == food.getDaysToExpire() && getType().equals(food.getType());
    }

    @Override
    public String toString() {
        return "Food{" +
                "type='" + type + '\'' +
                ", daysToExpire=" + daysToExpire +
                '}';
    }
    @Override
    public double calculate(){
        if(this.daysToExpire < 5) {
         return this.getPrice() *0.7;
        }
        else {
            return this.getPrice();
        }
    }
}
