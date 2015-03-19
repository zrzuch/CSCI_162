
import java.util.Scanner;

public class TestGroceryList {

    public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	GroceryList myList = new GroceryList();

	System.out.println("How many items do you want to create? ");
	int numItem = 0;

	while (numItem <= 0 || numItem > 10) {

	    numItem = console.nextInt();
	    assert numItem <= 0 || numItem > 10 : "Can't Be More Than 10";

	}
	for (int i = 0; i < numItem; i++) {

	    System.out.println("Enter the name for the item " + (i + 1) + ": ");
	    String name = console.next();

	    System.out.println("Enter the price for the item " + (i + 1) + ": ");
	    double price = console.nextDouble();

	    System.out.println("Enter the quantity for the item " + (i + 1) + ": ");
	    int quantity = console.nextInt();

	    GroceryItemOrder item = new GroceryItemOrder(name, quantity, price);

	    System.out.println("The total price for " + item.toString() + " is: " + item.getCost());
	    myList.add(item);
	}

	System.out.println();
	System.out.println("The total price for the grocery list is: " + myList.getTotalCost());
	console.close();
    }
}
