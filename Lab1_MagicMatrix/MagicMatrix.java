/* Project:    Lab9
 * Class:    MagicMatrix.java
 * Author:    Zachary Zuch
 * Date:    January 28, 2015
 * This program tests 9 values in a 2 dimensional
 * array.
 */

import java.util.Scanner;
import java.util.Arrays;

public class MagicMatrix {

	public static void main(String[] args) {
		// Variables and Objects
		int a = 0;
		Scanner input = new Scanner(System.in);

		while (a <= 0) {
			System.out
					.println("Enter the Number of Rows and Columns(One Value):");
			a = input.nextInt();
			assert a <= 0 : "Try Another Input Greater Than 0";
		}
		
		int[][] magicMatrix = new int[a][a];
		System.out.println(magicMatrix);
		magicMatrix = magicSquare(magicMatrix, input);

		if (isMagicSquare(magicMatrix, a)) {
			System.out.println("You created a magic square!");

		} else {
			System.out.println("These values do not make a magic square!");
		}
	}

	/**
	 * @param magicMatrix
	 *            The array
	 * @param input
	 *            Number of Rows and Columns
	 * @return
	 *
	 */
	public static int[][] magicSquare(int[][] magicMatrix, Scanner input) {
		String c = "";
		// Prompt that allows user to enter the values in multiple times
		while (!(c.equals("Y") || c.equals("YES"))) {
			// Initializes the Array
			for (int i = 0; i < magicMatrix.length; i++) {
				for (int j = 0; j < magicMatrix[i].length; j++) {
					System.out.println("Enter an integer for (" + (i + 1) + ","
							+ (j + 1) + ")");
					magicMatrix[i][j] = input.nextInt();
				}
			}
			// Asks User if it is correct
			System.out.println(Arrays.deepToString(magicMatrix));
			System.out.println("Is this array correct? (Yes or No)");
			c = input.next();
			c = c.toUpperCase();
		}
		return magicMatrix;
	}

	/**
	 * @param magicMatrix
	 *            The array
	 * @param a
	 *            Number of Rows and Columns
	 * @return
	 *
	 */
	public static boolean isMagicSquare(int[][] magicMatrix, int a) {
		// Tests the Array
		int[] test = new int[a];
		int[] test2 = new int[a];
		int test3 = 0, test4 = 0;

		for (int i = 0; i < magicMatrix.length; i++) {
			for (int j = 0; j < magicMatrix[i].length; j++) {
				test[i] = test[i] + magicMatrix[i][j];
				test2[i] = test2[i] + magicMatrix[j][i];
			}
			test3 = test3 + magicMatrix[i][i];
			test4 = test4 + magicMatrix[i][(magicMatrix.length - 1) - i];
		}
		return Arrays.equals(test, test2) && test[0] == test3 && test3 == test4;
	}
}
