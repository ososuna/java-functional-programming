package dev.ososuna.functional.classes.streams;

import java.util.List;
import java.util.stream.Stream;

import dev.ososuna.functional.classes.NameUtils;

public class Streams {
  public static void main(String[] args) {
    List<String> courseList = NameUtils.getList(
      "Java", "Frontend", "Backend", "Fullstack"
    );
    for (String course : courseList) {
      String newCourseName = course.toLowerCase().replace("!", "!!");
      System.out.println("Platzi: " + newCourseName);
    }

    Stream<String> coursesStream = Stream.of(
      "Java", "Frontend", "Backend", "Fullstack"
    );
    // Stream<Integer> courseLengthStream = coursesStream.map(course -> course.length());
    // Optional<Integer> longest = courseLengthStream.max((x, y) -> y - x);

    Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");
    Stream<String> justJavaCourses = emphasisCourses.filter(course -> course.contains("Java"));
    justJavaCourses.forEach(System.out::println);
  }
}
