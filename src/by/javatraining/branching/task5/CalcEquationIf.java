package by.javatraining.branching.task5;

import java.io.*;

/*
 * Вычислить значение функции:
 * F(x)={x^2 - 3x + 9, если x <= 3; 1/(x^3 + 6), если x > 3}
 */

public class CalcEquationIf {

	public static void main(String[] args) {
		double x = 0.0;
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Вычислить значение функции: F(x)={x^2 - 3x + 9, если x <= 3; 1/(x^3 + 6), если x > 3}");

		do {
			try {
				System.out.println("Введите значение для x:");
				System.out.print(">> ");
				x = Double.parseDouble(stdIn.readLine());
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				continue;
			} catch (IOException e) {
				e.printStackTrace();
				continue;
			}
		} while (true);
		
		double funcResult;
		if (x <= 3) {
			funcResult = Math.pow(x, 2) - (3 * x) + 9;
		} else {
			funcResult = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("Результат: " + funcResult);
	}
}
