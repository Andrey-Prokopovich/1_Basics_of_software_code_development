package by.javatraining.cycle.task2;

import java.io.*;

/*
 * Вычислить значение функции на отрезке [a,b] с шагом h:
 * y = {x, если x > 2; -x, если x <= 2}
 */

public class CalcStepIf {

	public static void main(String[] args) {
		int[] abh = new int[3];
		final char[] letter = { 'a', 'b', 'h' };
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out
				.println("Вычислить значение функции на отрезке [a,b] с шагом h: y = {x, если x > 2; -x, если x <= 2}");

		for (byte i = 0; i <= 2; i++) {
			do {
				try {
					System.out.println("Введите значение для " + letter[i] + ":");
					System.out.print(">> ");
					abh[i] = Integer.parseInt(stdIn.readLine());
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

		System.out.print("Результаты вычисления: ");
		if (abh[2] == 0) {
			int i;
			if (abh[2] >= 0) {
				i = Math.min(abh[0], abh[1]);
			} else {
				i = Math.max(abh[0], abh[1]);
			}

			System.out.print(((i > 2) ? 1 : (-1)) * i);
		} else {
			if (abh[2] >= 0) {
				for (int i = Math.min(abh[0], abh[1]); i <= Math.max(abh[0], abh[1]); i = i + abh[2]) {
					if (i > 2) {
						System.out.print((i != Math.min(abh[0], abh[1]) ? ", " : "") + i);
					} else {
						System.out.print((i != Math.min(abh[0], abh[1]) ? ", " : "") + (-i));
					}
				}
			} else {
				for (int i = Math.max(abh[0], abh[1]); i >= Math.min(abh[0], abh[1]); i = i + abh[2]) {
					if (i > 2) {
						System.out.print((i != Math.max(abh[0], abh[1]) ? ", " : "") + i);
					} else {
						System.out.print((i != Math.max(abh[0], abh[1]) ? ", " : "") + (-i));
					}
				}
			}

		}
		System.out.print("\n");
	}
}
