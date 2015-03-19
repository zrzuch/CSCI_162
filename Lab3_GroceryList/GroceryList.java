/* Project:	Lab9
 * Class:	GroceryList.java
 * Author:	Zachary Zuch
 * Date:	February 18, 2015
 * This program adds items to the list and returns the total.
 */

public class GroceryList {

    private static final int MAX_ITEMS = 10;
    private final GroceryItemOrder[] item;
    private int numItem;

    public GroceryList() {
	item = new GroceryItemOrder[MAX_ITEMS];
    }

    public void add(GroceryItemOrder item) {
	if (numItem < MAX_ITEMS) {
	    this.item[numItem] = item;
	    numItem++;
	} else {
	    System.out.println("Too Many Items");
	}
    }

    public double getTotalCost() {
	double total = 0;
	for (int i = 0; i < numItem; i++) {
	    total += item[i].getCost();
	}
	return total;
    }
}
