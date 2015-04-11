/* Project:	Lab8
 * Class:	StackTest.java
 * Author:	Zachary Zuch
 * Date:	April 8, 2015
 * This program enters data into a stack which it prints the stack
 * and an element of the stack.
 */
import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner console = new Scanner(System.in);

		System.out.println("How many things will you enter?");
		int x = input.nextInt();
		ArrayStack<String> sta = new ArrayStack<String>(x);

		String str = "";
		for (int i = 0; i < x; i++) {
			System.out.println("Enter Object #" + (i + 1));
			str = console.nextLine();
			if (str != "") {
				sta.push(str);
			}
		}

		System.out.println(sta);
		System.out.println();
		System.out.println("Enter a Position from the Top to Display:");
		System.out.println("From 0 to (Size - 1)");

		x = input.nextInt();
		System.out.println(sta.itemAt(x));

		System.out.println();
		System.out.println(sta);

		console.close();
		input.close();
	}

}
