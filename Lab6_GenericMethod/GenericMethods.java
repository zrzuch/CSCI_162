import java.util.Scanner;
import java.util.*;

public class GenericMethods {
	private static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] myData = getInput();
		System.out.println("------Original sequence------");
		print(myData);
		System.out.println("-------Reverse sequence-------");
		reverse(myData);
		print(myData);

	}
	public static <T> T[] getInput() {
		System.out.println("How many numbers do you want to add to the array?");
		int num = console.nextInt();
		T[] array;
		array = (T[]) new Object[num];
		System.out.println("Enter the elements one by one: ");
		for (int i = 0; i < num; i++) {
			array[i] = (T) console.next();
		}
		return array;
	}

	public static <T> void print(T[] x) {
		for (T a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static <T> void reverse(T[] x) {
		for(int i = 0; i < x.length / 2; i++) {
			T temp = x[i];
			x[i] = x[(x.length - i) - 1];
			x[(x.length - i) - 1] = temp;
		}
	}
}
