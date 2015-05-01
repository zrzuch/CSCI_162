import java.util.Scanner;

public class Recursive {

	private static int i;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		i = -1;
		System.out.println("Enter a Number to Return ONLY the Even Digits");
		int x = input.nextInt();
		int x2 = evenDigits(x);
		System.out.println("(" + x + ") " + "returns " + x2);
		input.close();

	}

	private static int evenDigits(int n) {
		if (n < 0) {
			return evenDigits(n * -1) * -1;
		} else if (n < 10) {
			if (isEven(n)) {
				i++;
				return n * power(10, i);
			} else {
				return 0;
			}
		} else {
			if (isEven(n % 10)) {
				i++;
				return ((n % 10) * power(10, i)) + evenDigits(n / 10);
			} else {
				return evenDigits(n / 10);
			}
		}

	}

	private static int power(int base, int exp) {
		if (base > 0) {
			int x = 1;
			for (int i = 0; i < exp; i++) {
				x *= base;
			}
			return x;
		}
		return 1;
	}

	private static boolean isEven(int n) {
		if (n == 2 || n == 4 || n == 6 || n == 8) {
			return true;
		}
		return false;
	}
}
