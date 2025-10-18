#!/bin/bash
set -e

PKG="src/programming/sec02/ch09/step06"
mkdir -p "$PKG"

# --- Exercise 1 ---
printf '%s\n' \
"package programming.sec02.ch09.step06;

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
}" > "$PKG/Exercise1_PrintOddNumbers.java"

# --- Exercise 2 ---
printf '%s\n' \
"package programming.sec02.ch09.step06;

import java.util.List;

public class Exercise2_PrintAllCourses {

    public static void main(String[] args) {
        List<String> courses = List.of(\"Spring\", \"Spring Boot\", \"API\", \"Microservices\", \"AWS\", \"PCP\", \"Azure\", \"Docker\", \"Kubernetes\");
        printAllCourses(courses);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
               .forEach(System.out::println);
    }
}" > "$PKG/Exercise2_PrintAllCourses.java"

# --- Exercise 3 ---
printf '%s\n' \
"package programming.sec02.ch09.step06;

import java.util.List;

public class Exercise3_PrintSpringCourses {

    public static void main(String[] args) {
        List<String> courses = List.of(\"Spring\", \"Spring Boot\", \"API\", \"Microservices\", \"AWS\", \"PCP\", \"Azure\", \"Docker\", \"Kubernetes\");
        printSpringCourses(courses);
    }

    private static void printSpringCourses(List<String> courses) {
        courses.stream()
               .filter(course -> course.contains(\"Spring\"))
               .forEach(System.out::println);
    }
}" > "$PKG/Exercise3_PrintSpringCourses.java"

# --- Exercise 4 ---
printf '%s\n' \
"package programming.sec02.ch09.step06;

import java.util.List;

public class Exercise4_PrintCoursesAtLeast4Letters {

    public static void main(String[] args) {
        List<String> courses = List.of(\"Spring\", \"Spring Boot\", \"API\", \"Microservices\", \"AWS\", \"PCP\", \"Azure\", \"Docker\", \"Kubernetes\");
        printCoursesWithAtLeast4Letters(courses);
    }

    private static void printCoursesWithAtLeast4Letters(List<String> courses) {
        courses.stream()
               .filter(course -> course.length() >= 4)
               .forEach(System.out::println);
    }
}" > "$PKG/Exercise4_PrintCoursesAtLeast4Letters.java"

# --- Exercise 5 ---
printf '%s\n' \
"package programming.sec02.ch09.step06;

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
}" > "$PKG/Exercise5_PrintCubesOfOddNumbers.java"

# --- Exercise 6 ---
printf '%s\n' \
"package programming.sec02.ch09.step06;

import java.util.List;

public class Exercise6_PrintCourseNameLengths {

    public static void main(String[] args) {
        List<String> courses = List.of(\"Spring\", \"Spring Boot\", \"API\", \"Microservices\", \"AWS\", \"PCP\", \"Azure\", \"Docker\", \"Kubernetes\");
        printCourseNameLengths(courses);
    }

    private static void printCourseNameLengths(List<String> courses) {
        courses.stream()
               .map(course -> course + \" → \" + course.length() + \" characters\")
               .forEach(System.out::println);
    }
}" > "$PKG/Exercise6_PrintCourseNameLengths.java"

echo "✅ All 6 Java files generated successfully!"
echo "📁 Location: $PKG"