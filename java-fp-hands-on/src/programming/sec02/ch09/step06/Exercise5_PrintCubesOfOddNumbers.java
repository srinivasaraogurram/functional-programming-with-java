package programming.sec02.ch09.step06;

import java.util.Arrays;
import java.util.List;

public class Exercise5_PrintCubesOfOddNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        printCubesOfOddNumbers(numbers);
    }

    private static void printCubesOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
               .filter(n -> n % 2 != 0)
               .map(n -> n * n * n)
               .forEach(System.out::println);
    }
}
