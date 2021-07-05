package by.javatraining.cycle.task1;

import java.io.*;
import java.util.Random;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class SumOfN {

	public static void main(String[] args) {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		int lastNumber = 1;

		System.out.println("Проссумировать N чисел");

		do {
			try {
				System.out.println("Введите значение для N:");
				System.out.print(">> ");
				lastNumber = Integer.parseUnsignedInt(stdIn.readLine());
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				continue;
			} catch (IOException e) {
				e.printStackTrace();
				continue;
			}
		} while (true);

		Random rng = new Random();
		double result = 0;
		for (int i = 1; i <= lastNumber; i++) {
			double dNum = (rng.nextDouble() * 21 - 10);
			System.out.print((i > 1 ? ", " : "") + dNum + (i == lastNumber ? "\n" : ""));
			result = result + dNum;
		}

		System.out.printf("Результат сложения %.3f случайных чисел: %.3f", lastNumber, result);
	}
}
