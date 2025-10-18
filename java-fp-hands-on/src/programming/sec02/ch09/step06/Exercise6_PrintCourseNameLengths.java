package programming.sec02.ch09.step06;

import java.util.List;

public class Exercise6_PrintCourseNameLengths {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCP", "Azure", "Docker", "Kubernetes");
        printCourseNameLengths(courses);
    }

    private static void printCourseNameLengths(List<String> courses) {
        courses.stream()
               .map(course -> course + " → " + course.length() + " characters")
               .forEach(System.out::println);
    }
}
