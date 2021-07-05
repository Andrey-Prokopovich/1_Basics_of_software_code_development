package by.javatraining.linear_program.task1;

import java.io.*;

/*
 * Найти значение функции: z = ((a - 3) * b / 2) + c
 */

public class Calc3VarEquation {

	public static void main(String[] args) {
		int[] abc = new int[3];
		final char[] letter = { 'a', 'b', 'c' };
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Вычисляется результат выражения: z = ((a - 3) * b / 2) + c");

		for (byte i = 0; i <= 2; i++) {
			do {
				try {
					System.out.println("Введите значение для " + letter[i] + ":");
					System.out.print(">> ");
					abc[i] = Integer.parseInt(stdIn.readLine());
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
		
		int result = ((abc[0] - 3) * abc[1] / 2) + abc[2];

		System.out.println("Результат вычисления: z = " + result);
	}
}
