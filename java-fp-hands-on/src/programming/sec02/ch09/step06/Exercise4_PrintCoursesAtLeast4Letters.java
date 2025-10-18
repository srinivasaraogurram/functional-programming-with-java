package programming.sec02.ch09.step06;

import java.util.List;

public class Exercise4_PrintCoursesAtLeast4Letters {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCP", "Azure", "Docker", "Kubernetes");
        printCoursesWithAtLeast4Letters(courses);
    }

    private static void printCoursesWithAtLeast4Letters(List<String> courses) {
        courses.stream()
               .filter(course -> course.length() >= 4)
               .forEach(System.out::println);
    }
}
