import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Getting User Data
        System.out.println("Please enter the price of your item: $");
        double itemPrice = in.nextDouble();
        double shippingCost;


        //Conditionals
        if (itemPrice >= 100) {
            shippingCost = 0;
        } else {
            shippingCost = itemPrice * 0.02;}

        double totalCost = itemPrice + shippingCost;
        //Outputs
        System.out.println("Your Shipping Cost is: $" + String.format("%.2f", shippingCost));
        System.out.println("Your Total Cost is: $" + totalCost);
    }
}