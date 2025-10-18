package programming.sec02.ch09.step06;

import java.util.List;

public class Exercise3_PrintSpringCourses {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCP", "Azure", "Docker", "Kubernetes");
        printSpringCourses(courses);
    }

    private static void printSpringCourses(List<String> courses) {
        courses.stream()
               .filter(course -> course.contains("Spring"))
               .forEach(System.out::println);
    }
}
