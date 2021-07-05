package by.javatraining.cycle.task8;

import java.io.*;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class NumberInNumbers {

	public static void main(String[] args) {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Даны два числа. Определить цифры,  входящие в запись как первого так и второго числа.");

		int num1 = 0;
		int num2 = 0;
		for (byte i = 0; i <= 1; i++) {
			do {
				try {
					if (i == 0) {
						System.out.println("Введите первое число:");
						System.out.print(">> ");
						
						num1 = Integer.parseUnsignedInt(stdIn.readLine());
						
						if (num1 == 0) {
							System.out.println("Значение не может быть нулевым!");
							continue;
						}
					} else {
						System.out.println("Введите второе число:");
						System.out.print(">> ");
						
						num2 = Integer.parseUnsignedInt(stdIn.readLine());
						
						if (num2 == 0) {
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

		int check2 = 0;
		int modulus = 0;
		boolean[] numFound = new boolean[10];
		System.out.print("Результат: ");
		while (num1 > 0) {
			modulus = num1 % 10;
			num1 = num1 / 10;
			check2 = num2;

			while (check2 > 0) {
				if ((check2 % 10) == modulus) {
					if (!numFound[modulus - 1]) {
						numFound[modulus - 1] = true;
					}
				}
				check2 = check2 / 10;
			}
		}

		for (byte i = 0; i <= 9; i++) {
			if (numFound[i]) {
				System.out.print((i + 1) + (i < 9 ? " " : ""));
			}
		}
	}
}
