/* Project:    Lab7
 * Class:    LotteryBag.java
 * Author:    Zachary Zuch
 * Date:    April 1, 2015
 * This class keeps track of a collection of data.
 */
public class LotteryBag<T> {

	private Object[] bag;
	private int count;
	private int initialSize;

	public LotteryBag(int x) {
		bag = new Object[x];
		initialSize = x;
		count = 0;
		
	}

	public <E> void add(E x) {
		bag[count] = x;
		count++;
	}

	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return count;
	}
	
	public int initialSize() {
		return initialSize;
	}

	public Object popIndex(int index) {
		Object temp = bag[index];
		if (index != size() - 1) {
			bag[index] = bag[size() - 1];
			bag[size() - 1] = null;
		} else {
			bag[index] = null;
		}
		count--;
		return temp;
	}

	public Object getIndex(int index) {
		return bag[index];
	}

	public Object[] toArray() {
		return bag;
	}

	public String toString() {
		String s = "";
		if (!(isEmpty())) {
			s = (String) bag[0];
			for (int i = 1; i < bag.length; i++) {
				s += ", " + bag[i];
			}
		}
		return s;
	}
}
