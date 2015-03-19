public class IntNode {

	private int data;
	private IntNode next;

	public IntNode() {
		data = 0;
		next = null;
	}

	public IntNode(int x) {
		data = x;
		next = null;
	}

	public IntNode(int x, IntNode l) {
		data = x;
		next = l;
	}

	public int getData() {
		return data;
	}

	public IntNode getNext() {
		return next;
	}

	public void setData(int x) {
		data = x;
	}

	public void setNext(IntNode n) {
		next = n;
	}
}
