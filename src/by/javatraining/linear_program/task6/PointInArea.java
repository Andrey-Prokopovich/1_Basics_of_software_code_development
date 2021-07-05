package by.javatraining.linear_program.task6;

import java.io.*;

/*
 * Для данной области составить линейную программу, которая отвечает true, если точка с координатами (x,y) 
 * принадлежит закрашенной области, и false - в противном случае.
 * Точки углов: (-4,0), (-2,0), (-2,4), (2,4), (2,0), (4,0), (4,-3), (-4,-3). (0,-1) и круг в 0,5 - считается за пределами области.
 */

public class PointInArea {

	public static void main(String[] args) {
		double[] xy = new double[2];
		final char[] letter = { 'x', 'y' };
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Проверить попадаение (x,y) в определенную зону");

		for (byte i = 0; i <= 1; i++) {
			do {
				try {
					System.out.print("Введите значение для " + letter[i] + ": ");
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

		boolean foundHigh = ((-2) <= xy[0]) && (xy[0] <= 2) && (0 <= xy[1]) && (xy[1] <= 4);
		
		boolean foundInCircle = (Math.pow(xy[0] - 0, 2) + Math.pow(xy[1] - (-1), 2)) <= Math.pow(0.5, 2);
		
		boolean foundLow;
		if (foundInCircle) {
			foundLow = false;
		} else {
			foundLow = (((-4) <= xy[0]) && (xy[0] <= 4) && (-3 <= xy[1]) && (xy[1] <= 0));
		}
		
		System.out.println("Результат вычисления: " + ((xy[1] > 0) ? foundHigh : foundLow));
	}
}
