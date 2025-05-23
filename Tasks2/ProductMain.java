//Product class with Parameterized constructor

import java.util.Scanner;

class Product{
    int pid;
    double price;
    int quantity;

    //constructor
    Product(int pid, double price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

//Main class
public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array to store 5 product details
        Product[] products = new Product[5];

        //variables to track total amount and product with highest price
        double totalAmount = 0;
        double maxPrice = 0;
        int maxPricePid = 0;

        //using for loop method for accept details for 5 products 
        for(int i=0; i<5; i++){
            System.out.println("Enter details for products " + (i+1));

            System.out.println("Product ID: ");
            int pid = sc.nextInt();

            System.out.println("Price: ");
            double price = sc.nextDouble();

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            //create a new product object and store it in the array
            products[i] = new Product(pid, price, quantity);

            //update total amount spent (Add to the total amount)
            totalAmount = totalAmount + (price * quantity);

            //check if this product has highest price
            if(price > maxPrice){
                maxPrice = price;
                maxPricePid = pid;
            }
        }

        //output
        System.out.println("\n Product ID with the highest price: " + maxPricePid);
        System.out.println("\n Total amount spent on all products: " + totalAmount);

        sc.close();
    }
}
