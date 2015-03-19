/* Project:	Lab9
 * Class:	GroceryList.java
 * Author:	Zachary Zuch
 * Date:	February 18, 2015
 * This program creates an order, gets the cost, and returns item and quantity in a string.
 */

public class GroceryItemOrder {

    private final String name;
    private int quantity;
    private final double pricePerUnit;

    public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
	this.name = name;
	this.quantity = quantity;
	this.pricePerUnit = pricePerUnit;
    }

    public double getCost() {
	double cost = this.quantity * this.pricePerUnit;
	return cost;
    }

    public void setQuantity(int quantity) {
	this.quantity = quantity;
    }

    @Override
    public String toString() {
	return quantity + " " + name;
    }
}
