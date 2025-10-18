package programming.sec02.ch09.step06;

import java.util.Arrays;
import java.util.List;

public class ProcessOddNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        processOddNumbers(numbers);
    }

    private static void processOddNumbers(List<Integer> numbers) {
        numbers.stream()
               .filter(n -> n % 2 != 0)
               .map(n -> n * 2)
               .sorted()
               .forEach(System.out::println);
    }
}