public class IntLinkedList {

	private IntNode head;
	private int size;

	public IntLinkedList() {
		head = null;
		size = 0;
	}

	public void add(int x) {
		if (head == null) {
			head = new IntNode(x);
		} else {
			IntNode temp = new IntNode(x);
			IntNode current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(temp);
		}
		size++;
	}

	public void convertArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			add(x[i]);
		}
	}

	public void empty() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public boolean isSorted() {
		if (head == null) {
			return true;
		}
		IntNode current = head;
		while (current.getNext() != null) {
			if (current.getData() > current.getNext().getData()) {
				return false;
			}
			current = current.getNext();
		}
		return true;
	}

	public void removeFirst() {
		if (head != null) {
			head = head.getNext();
			size--;
		}
	}

	public void removeInt(int x) {
		if (head != null) {
			if (head.getData() == x) {
				head = head.getNext();
			} else {
				IntNode current = head;
				while (current.getNext() != null
						&& x != current.getNext().getData()) {
					current = current.getNext();
				}
				current.setNext(current.getNext().getNext());
			}
			size--;
		}
	}

	public void removeLast() {
		if (head != null && head.getNext() != null) {
			IntNode current = head;
			while (current.getNext().getNext() != null) {
				current = current.getNext();
			}
			current.setNext(null);
			size--;
		} else if (head.getNext() == null) {
			head = null;
			size--;
		}
	}

	// Selection Sort
	public void sort() {
		if (head != null && head.getNext() != null && !(isSorted())) {
			int[] x = toArray();
			empty();
			// Can be used in a method for arrays
			for (int i = 0; i < x.length; i++) {
				int min = i;
				for (int j = i; j < x.length; j++) {
					if (x[min] > x[j]) {
						min = j;
					}
				}
				if (x[i] != x[min]) {
					int temp = x[i];
					x[i] = x[min];
					x[min] = temp;
				}
			}
			convertArray(x);
		}
	}

	public int size() {
		return size;
	}

	public int[] toArray() {
		int[] x = new int[size];
		IntNode current = head;
		int i = 0;
		while (current != null) {
			x[i] = current.getData();
			current = current.getNext();
			i++;
		}
		return x;
	}

	@Override
	public String toString() {
		IntNode current = head;
		String output = "[";
		if (!(isEmpty())) {
			output += current.getData();
			current = current.getNext();
			while (current != null) {
				output += ", " + current.getData();
				current = current.getNext();
			}
		}
		output += "]";
		return output;
	}

	public <E> void printArray(E[] x) {
		for (E a : x) {
			System.out.println(a);
		}
		System.out.println();
	}
}
