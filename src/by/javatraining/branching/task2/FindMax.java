package by.javatraining.branching.task2;

import java.io.*;

/*
 * Найти max{min(a,b), min(c,d)}
 */

public class FindMax {

	public static void main(String[] args) {
		double[] abcd = new double[4];
		final char[] letter = { 'a', 'b', 'c', 'd' };
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Найти max{min(a,b), min(c,d)}");

		for (byte i = 0; i <= 3; i++) {
			do {
				try {
					System.out.println("Введите значение для " + letter[i] + ":");
					System.out.print(">> ");
					abcd[i] = Double.parseDouble(stdIn.readLine());
					break;
				} catch (NumberFormatException e) {
					e.printStackTrace();
					continue;
				} catch (IOException e) {
					e.printStackTrace();
					continue;
				}
			} while (true);
		}

		double minAB = Math.min(abcd[0], abcd[1]);
		double minCD = Math.min(abcd[2], abcd[3]);
		double maxOfMins = Math.max(minAB, minCD);

		System.out.println("Результат: " + maxOfMins);
	}
}
