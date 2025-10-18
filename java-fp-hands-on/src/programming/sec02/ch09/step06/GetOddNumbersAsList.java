package programming.sec02.ch09.step06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetOddNumbersAsList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> oddList = getOddNumbersAsList(numbers);
        System.out.println("Odd numbers: " + oddList);
    }

    private static List<Integer> getOddNumbersAsList(List<Integer> numbers) {
        return numbers.stream()
                      .filter(number -> number % 2 != 0)
                      .collect(Collectors.toList());
    }
}