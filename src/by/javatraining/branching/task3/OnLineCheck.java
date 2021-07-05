package by.javatraining.branching.task3;

import java.io.*;

/*
 * Даны три точки A(x1,y1), B(x2,y2) и c(x3,y3). Определить, будут ли они расположены на одной прямой.
 */

public class OnLineCheck {

	public static void main(String[] args) {
		double[][] abc = new double[3][2]; // первые [] - это x-ы, вторые [] - это y-ки
		final char[] pointLetter = { 'A', 'B', 'C' };
		final char[] coordLetter = { 'x', 'y' };
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(
				"Даны три точки A(x1,y1), B(x2,y2) и c(x3,y3). Определить, будут ли они расположены на одной прямой");

		for (byte i = 0; i <= 2; i++) { // цикл по точкам A-B-C
			for (byte j = 0; j <= 1; j++) { // цикл по координатам x-y
				do {
					try {
						System.out.println(
								"Введите значение для " + coordLetter[j] + (i + 1) + " точки " + pointLetter[i] + ":");
						System.out.print(">> ");
						abc[i][j] = Double.parseDouble(stdIn.readLine());
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
		}

		// определяет, лежат ли точки на одной прямой через формулу
		// (x1−x2)*(y3−y2)=(x3−x2)*(y1−y2)
		double leftPart = ((abc[0][0] - abc[1][0]) * (abc[2][1] - abc[1][1]));
		double rightPart = ((abc[2][0] - abc[1][0]) * (abc[0][1] - abc[1][1]));
		boolean bothOnSameLine = leftPart == rightPart;

		System.out
				.println("Результат: точки A, B и C " + (bothOnSameLine ? "" : "не ") + "расположены на одной прямой");
	}

}
