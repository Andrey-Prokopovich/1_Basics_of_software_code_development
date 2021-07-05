package by.javatraining.cycle.task5;

import java.io.*;

/*
 * Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда,
 * модуль которых больше или равен заданному e.
 * Общий член ряда имеет вид: an = 1/(2^n) + 1/(3^n)
 */

public class NumberRowSum {

	public static void main(String[] args) {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Найти сумму членов ряда, модуль которых больше или равен заданному e");

		int nLength = 0;
		double eNumber = 0;
		for (byte i = 0; i <= 1; i++) {
			do {
				try {
					if (i == 0) {
						System.out.println("Введите значение длины ряда:");
						System.out.print(">> ");

						nLength = Integer.parseUnsignedInt(stdIn.readLine());

						if (nLength == 0) {
							System.out.println("Значение не может быть нулевым!");
							continue;
						}
					} else {
						System.out.println("Введите значение числа e:");
						System.out.print(">> ");

						eNumber = Double.parseDouble(stdIn.readLine());

						if (eNumber <= 0) {
							System.out.println("Значение не может быть нулевым или отрицательным!");
							continue;
						}
					}

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

		double dResult = 0;
		for (int i = 1; i <= nLength; i++) {
			double dRowMember = Math.abs((1 / Math.pow(2, i)) + (1 / Math.pow(3, i)));
			dResult = dResult + (dRowMember >= eNumber ? dRowMember : 0);
		}

		System.out.println("Результат: " + dResult);
	}
}
