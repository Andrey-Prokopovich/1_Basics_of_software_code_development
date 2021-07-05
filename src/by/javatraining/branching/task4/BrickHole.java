package by.javatraining.branching.task4;

import java.io.*;

/*
 * Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

public class BrickHole {

	public static void main(String[] args) {
		double[] abxyz = new double[5];
		final char[] letter = { 'A', 'B', 'x', 'y', 'z' };
		byte[][] abPassedBy = new byte[2][3]; // первые [] - индекс стороны отверстия,
												// вторые [] - индекс стороны кирпича которая прошла
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.");
		System.out.println("Определить, пройдет ли кирпич через отверстие.");

		for (byte i = 0; i <= 4; i++) {
			do {
				try {
					System.out.println("Введите значение " + letter[i] + ":");
					System.out.print(">> ");
					abxyz[i] = Double.parseDouble(stdIn.readLine());
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

		// проверяет, какая из сторон кирпича проходит по какой стороне отверстия
		for (byte i = 0; i <= 1; i++) {
			for (byte j = 2; j <= 4; j++) {
				abPassedBy[i][j - 2] = ((abxyz[i] >= abxyz[j] ? j : 0));
			}
		}

		int PassRes = 0;
		boolean isPassed = false;
		// проверяет, может ли кирпич пройти в отверстие
		for (byte i = 0; i <= 2; i++) {
			if ((abPassedBy[0][i] != 0) && (abPassedBy[1][i] != 0) && (abPassedBy[0][i] != abPassedBy[1][i])) {
				PassRes = i;
				isPassed = true;
			}
		}

		String passedSide = " стороной " + letter[abPassedBy[0][PassRes]] + letter[abPassedBy[1][PassRes]];

		System.out.println("Результат: кирпич xyz " + (isPassed ? "" : "не ") + "проходит в отверстие AB"
				+ (isPassed ? "" : passedSide));
	}
}
