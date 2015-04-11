/* Project:    Lab7
 * Class:    LotteryBag.java
 * Author:    Zachary Zuch
 * Date:    April 1, 2015
 * This is the driver class that runs the program and uses the collection class.
 */
import java.util.Random;
import java.util.Scanner;

public class GenericMethods {

	private static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		LotteryBag<String> awards = new LotteryBag<String>(3);
		LotteryBag<String> names = new LotteryBag<String>(3);
		LotteryBag<Integer> times = new LotteryBag<Integer>(3);

		getInput(names, "Name");
		getInput(awards, "Award");
		getInput(times, "Duration(Integer)");
		
		printStuff(names, awards, times);
	}

	public static <T> void getInput(LotteryBag<T> b, String s) {
		System.out.println("Enter a/an " + s + " 3 Times");

		while (b.size() < 3) {
			System.out.println();
			System.out.println("Enter a/an " + s + ":");
			b.add(console.nextLine());
		}
	}

	public static <T> void printStuff(LotteryBag<String> a,
			LotteryBag<String> b, LotteryBag<Integer> c) {
		System.out.println();
		for (int i = 0; i < a.initialSize(); i++) {
			System.out.print(grab(a) + " ");
			System.out.print("has been awarded a/an ");
			System.out.print(grab(b) + " for ");
			System.out.println(grab(c) + " months.");
		}
	}
	
	public static <E> Object grab(LotteryBag<E> b) {
		Random r = new Random();
		return b.popIndex(r.nextInt(b.size()));
	}
}
