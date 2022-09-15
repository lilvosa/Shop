public class Main {
    public static void main (String[]args){
       Product productOne = new Food(10,3.5,"bread",5);
       Product productTwo = new Food(7,15,"chocolate",7);
       Product productThree = new Drink(4,13.50,"Lavazza",true);
       Product productFour = new Drink(50,27.99,"Cappy",true);
       Product productFive = new Food(35,87.95,"pasta",28);
       Product productSix = new Food(27,36.25,"pizza",3);
       Product productSeven = new Drink(46,39.99,"Jack Daniels",true);
       Product productEight = new Drink(16,24.26,"Captain Morgan",false);

       Shop shop = new Shop("Supermarket");
        shop.addProduct(productSeven);
        shop.addProduct(productThree);
        shop.addProduct(productTwo);
        shop.addProduct(productFive);
        shop.addProduct(productOne);
        shop.addProduct(productSeven);
        shop.addProduct(productFour);
        shop.addProduct(productSix);
        shop.addProduct(productEight);
        shop.addProduct(productOne);

        System.out.println(shop.toString());

        System.out.println("Total quantity of available products: " + shop.getTotalQuantity());
        System.out.println("The most expensive product is: " + shop.getMostExpensiveProduct());
        System.out.println("Number of food products is: " + shop.getFoodCount());
        System.out.println("The products that will expire in 15 days: " + shop.getProductsThatWillExpire(15));



    }
}
