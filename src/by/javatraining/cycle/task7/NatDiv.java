package by.javatraining.cycle.task7;

import java.io.*;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class NatDiv {

	public static void main(String[] args) {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(
				"Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.");

		int m = 0;
		int n = 0;
		for (byte i = 0; i <= 1; i++) {
			do {
				try {
					if (i == 0) {
						System.out.println("Введите значение длины ряда:");
						System.out.print(">> ");
						
						m = Integer.parseUnsignedInt(stdIn.readLine());
						
						if (m == 0) {
							System.out.println("Значение не может быть нулевым!");
							continue;
						}
					} else {
						System.out.println("Введите значение числа e:");
						System.out.print(">> ");
						
						n = Integer.parseUnsignedInt(stdIn.readLine());
						
						if (n == 0) {
							System.out.println("Значение не может быть нулевым!");
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

		for (int i = Math.min(m, n); i <= Math.max(m, n); i++) {
			System.out.print("Делители числа " + i + ": ");
			for (int j = 2; j < i; j++) {
				if ((i % j) == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.print("\n");
		}
	}
}
