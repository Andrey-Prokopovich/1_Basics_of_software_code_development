package by.javatraining.linear_program.task3;

import java.io.*;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * ((sin(x) + cos(y)) / (cos(x) - sin(y))) * tan(xy)
 */

public class CalcSinCosEquation {

	public static void main(String[] args) {
		double[] xy = new double[2];
		final char[] letter = { 'x', 'y' };
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Вычисляется результат выражения: ((sin(x) + cos(y))/(cos(x) - sin(y)))*tan(xy)");

		for (byte i = 0; i <= 1; i++) {
			do {
				try {
					System.out.println("Введите значение для " + letter[i] + ":");
					System.out.print(">> ");
					xy[i] = Double.parseDouble(stdIn.readLine());
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
		
		double result = Math.sin(xy[0]) + Math.cos(xy[1]);
		result = result / (Math.cos(xy[0]) - Math.sin(xy[1]));
		result = result * (Math.tan(xy[0] * xy[1]));

		System.out.println("Результат вычисления: " + result);
	}
}
