package by.javatraining.linear_program.task2;

import java.io.*;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * ((b + sqrt((b^2) + (4ac))) / (2a)) - ((a^3)*c) + (b^-2)
 */

public class Calc3VarEquation2 {

	public static void main(String[] args) {
		double[] abc = new double[3];
		final char[] letter = { 'a', 'b', 'c' };
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Вычисляется результат выражения: ((b + sqrt((b^2) + (4ac)))/(2a)) - ((a^3)*c) + (b^-2)");

		for (byte i = 0; i <= 2; i++) {
			do {
				try {
					System.out.println("Введите значение для " + letter[i] + ":");
					System.out.print(">> ");
					abc[i] = Double.parseDouble(stdIn.readLine());
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
		
		double result = Math.pow(abc[1], 2) + (4 * abc[0] * abc[2]);
		result = Math.sqrt(result) + abc[1];
		result = result / (2 * abc[0]);
		result = result - (Math.pow(abc[0], 3) * abc[2]) + Math.pow(abc[1], -2);

		System.out.println("Результат вычисления: " + result);
	}
}
