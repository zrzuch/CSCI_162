import java.util.Scanner;

public class IntegerList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList list = new LinkedList();
		int x;

		// Loop to Enter Integers
		do {
			System.out.println("Enter a Integer to be Sorted: ");
			System.out.println("(Enter a Negative Integer to Exit) ");
			x = input.nextInt();

			// Tests for the Exit instead of adding it to the Linked List
			if (x >= 0) {
				list.add(x);
				System.out.println("Integer: " + x);
			} else {
				System.out.println("Exit");
			}

			System.out.println();
		} while (x >= 0);

		System.out.println(list);
		System.out.println(list.isSorted());
		input.close();
	}
}
