/*
 * Project: Lab4
 * Class: Statistician.java
 * Author: Zachary Zuch
 * Date: March 04, 2015
 * This program keeps track of a set of double
 * values, and it returns the length, sum, largest
 * number, smallest number, and the last number.
 */

public class Statistician {

    private int count;
    private double large;
    private double last;
    private double small;
    private double sum;

    public Statistician() {
	count = 0;
	large = 0;
	last = 0;
	small = 0;
	sum = 0;
    }

    /**
     * This method adds and tests the next number to see if it meets any of the variable's criteria and the other methods return the variables.
     *
     * @param x The number to be added and tested.
     */
    public void nextNumber(double x) {
	if (count == 0) {
	    large = x;
	    small = x;
	} else {
	    if (x > large) {
		large = x;
	    }
	    if (x < small) {
		small = x;
	    }
	}
	count++;
	last = x;
	sum += x;
    }

    public int length() {
	return count;
    }

    public double last() {
	return last;
    }

    public double sum() {
	return sum;
    }

    public double mean() {
	return sum / count;
    }

    public double smallest() {
	return small;
    }

    public double largest() {
	return large;
    }
}
