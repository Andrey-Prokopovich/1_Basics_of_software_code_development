package by.javatraining.cycle.task4;

/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class TwoHundredSquaresMult {

	public static void main(String[] args) {
		System.out.println("Найти произведение квадратов первых двухсот чисел.");

		long result = 0L;
		for (long i = 1L; i <= 200L; i++) {
			if (i == 1) {
				result = i * i;
			} else {
				long square = i * i;
				result = result * square;
			}
			
			System.out.println(i + " : " + result);
		}

		System.out.println("Конечный результат: " + result);
	}
}
