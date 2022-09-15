import javax.swing.*;
import java.util.*;

public class Shop {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Shop(String name) {
        this.name = name;
    }
    public List<Product> getProducts(){
        return products;
    }

    //adds object to collection
     public void addProduct (Product product){
        products.add(product);
    }

    //calculates and returns the number of all available products
    public int getTotalQuantity(){
        int totalQuantity=0;
        for (Product current : products){
            totalQuantity += current.getQuantity();
        }
        return totalQuantity;
    }

    //returns the most expensive product from the collection
    public Product getMostExpensiveProduct() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.calculate() - o2.calculate());
            }
        });
        return products.get(products.size() - 1);
    }

    //returns how many of the products in collection are foods
    public int getFoodCount(){
        int foodCount=0;
        for (Product current : products){
            if (current instanceof Food){
                foodCount++;
            }
        }
        return foodCount;
    }

    //returns list of products that will expire in the less than given number of days
    public List<Product> getProductsThatWillExpire(int days) {
        List<Product> result = new ArrayList<>();
        for (Product current : products) {
            if (current instanceof Food && ((Food) current).getDaysToExpire() < days) {
                result.add(current);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Available products: " + Arrays.toString(products.toArray());
    }
}
