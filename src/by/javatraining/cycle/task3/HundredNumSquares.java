package by.javatraining.cycle.task3;

/*
 * Найти сумму квадратов первых ста чисел.
 */

public class HundredNumSquares {

	public static void main(String[] args) {
		System.out.println("Найти сумму квадратов первых ста чисел.");

		int result = 0;
		for (int i = 1; i <= 100; i++) {
			result = result + (i * i);
		}

		System.out.println("Результат: " + result);
	}
}