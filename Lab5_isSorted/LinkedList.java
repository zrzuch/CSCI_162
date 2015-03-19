public class LinkedList {

	private IntNode head;
	private int count;

	public LinkedList() {
		head = null;
		count = 0;
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
			count++;
		}
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isSorted() {
		if (isEmpty()) {
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

	// Returns count since it is used to find the size
	public int size() {
		return count;
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
}
