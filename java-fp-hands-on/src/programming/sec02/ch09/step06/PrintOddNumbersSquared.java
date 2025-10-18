package programming.sec02.ch09.step06;

import java.util.Arrays;
import java.util.List;

public class PrintOddNumbersSquared {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        printOddNumbersSquared(numbers);
    }

    private static void printOddNumbersSquared(List<Integer> numbers) {
        numbers.stream()
               .filter(number -> number % 2 != 0)
               .map(number -> number * number)
               .forEach(System.out::println);
    }
}