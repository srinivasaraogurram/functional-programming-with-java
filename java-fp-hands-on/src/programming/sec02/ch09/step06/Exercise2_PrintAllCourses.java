package programming.sec02.ch09.step06;

import java.util.List;

public class Exercise2_PrintAllCourses {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCP", "Azure", "Docker", "Kubernetes");
        printAllCourses(courses);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
               .forEach(System.out::println);
    }
}
