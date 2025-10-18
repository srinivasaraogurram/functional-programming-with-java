package programming.sec02.ch09.step06;

import java.util.Arrays;
import java.util.List;

public class PrintOddNumbersWithMessage {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        printOddNumbersWithMessage(numbers);
    }

    private static void printOddNumbersWithMessage(List<Integer> numbers) {
        numbers.stream()
               .filter(number -> number % 2 != 0)
               .forEach(number -> System.out.println("Odd number found: " + number));
    }
}