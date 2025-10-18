package programming.sec02.ch09.step06;

import java.util.Arrays;
import java.util.List;

public class Exercise1_PrintOddNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        printOddNumbers(numbers);
    }

    private static void printOddNumbers(List<Integer> numbers) {
        numbers.stream()
               .filter(number -> number % 2 != 0)
               .forEach(System.out::println);
    }
}
