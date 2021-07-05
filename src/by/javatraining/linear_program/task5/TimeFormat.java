package by.javatraining.linear_program.task5;

import java.io.*;

/*
 * Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: HHч MMмин SSс.
 */

public class TimeFormat {

	public static void main(String[] args) {
		int intSeconds;
		int[] iTime = new int[3];
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Вывести секунды в формате: HHч MMмин SSс");

		do {
			try {
				System.out.print("Введите количество секунд: ");
				intSeconds = Integer.parseInt(stdIn.readLine());
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				continue;
			} catch (IOException e) {
				e.printStackTrace();
				continue;
			}
		} while (true);

		iTime[0] = intSeconds;

		iTime[1] = iTime[0] / 60;
		iTime[0] = iTime[0] - (iTime[1] * 60);

		iTime[2] = iTime[1] / 60;
		iTime[1] = iTime[1] - (iTime[2] * 60);

		String strRes = iTime[2] + "ч " + iTime[1] + "мин " + iTime[0] + "с";
		System.out.println("Результат вычисления: " + strRes);
	}
}
