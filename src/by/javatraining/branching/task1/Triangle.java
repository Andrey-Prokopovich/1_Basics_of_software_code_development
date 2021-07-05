package by.javatraining.branching.task1;

import java.io.*;

/*
 * Даны два треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */

public class Triangle {

	public static void main(String[] args) {
		int[] angle = new int[2];
		final String[] numLine = { "первого", "второго" };
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Проверить возможность существования треугольника и наличие у него прямого угла");

		for (byte i = 0; i <= 1; i++) {
			do {
				try {
					System.out.println("Введите значение " + numLine[i] + " угла:");
					System.out.print(">> ");
					angle[i] = Integer.parseUnsignedInt(stdIn.readLine());
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

		boolean isTrianglePossible = (angle[0] + angle[1]) < 180;
		boolean isTriangle90 = (angle[0] == 90) || (angle[1] == 90) || ((180 - angle[0] - angle[1]) == 90);

		if (isTrianglePossible) {
			System.out.println(
					"Результат: Треугольник существует и он " + (isTriangle90 ? "" : "не ") + "является прямоугольным");
		} else {
			System.out.println("Результат: Треугольник не существует");
		}
	}
}
