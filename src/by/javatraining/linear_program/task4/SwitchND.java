package by.javatraining.linear_program.task4;

import java.io.*;

/*
 * Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class SwitchND {

	public static void main(String[] args) {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Производится перестановка целой и дробной части введенного числа");

		double inNumber = 0.0;
		do {
			try {
				System.out.println("Введите число: ");
				System.out.print(">> ");
				
				inNumber = Double.parseDouble(stdIn.readLine());
				
				if (Math.abs(inNumber) > 999.999) {
					System.out.println("Введите число с не более чем тремя разрядами в целой части!");
					continue;
				} else {
					break;
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
				continue;
			} catch (IOException e) {
				e.printStackTrace();
				continue;
			}
		} while (true);

		int frontToBack = (int) inNumber;
		double outNumber = (inNumber - frontToBack) * 1000;
		outNumber = outNumber + (frontToBack / 1000);

		System.out.println("Результат: " + outNumber);
	}
}
