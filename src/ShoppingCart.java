import java.util.Scanner;
public class ShoppingCart {
    public static  void main (String[] args) {
        String item;
        double itemPrice;
        int quantity;
        char currency = '$';
        double totalPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("Please enter price for each " + item + " : ");
        itemPrice = scanner.nextDouble();

        System.out.print("How many would you like to buy?: ");
        quantity = scanner.nextInt();

        totalPrice = itemPrice * quantity;

        if (quantity == 1){
            System.out.println("\nYou have bought " + quantity + " " + item);
        }else {
            System.out.println("\nYou have bought " + quantity + " " + item + "s");
        }

        System.out.println("Your total is " + currency + totalPrice );
        scanner.close();
    }
}
