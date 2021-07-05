package by.javatraining.cycle.task6;

/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class CharNumCode {

	public static void main(String[] args) {
		System.out.println(
				"Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.");
		System.out.println("Вывод производится в формате: char - DEC");

		for (int i = 33; i <= 255; i++) {
			if ((i > 126) && (i < 161)) {
				continue;
			}
			System.out.println((char) i + " - " + i);
		}
	}
}
