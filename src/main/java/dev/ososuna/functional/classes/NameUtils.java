package dev.ososuna.functional.classes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NameUtils {

  public static void main(String[] args) {
    List<String> professors = getList(
      "John", "Paul", "George", "Ringo"
    );
    Consumer<String> printer = text -> System.out.println(text);
    professors.forEach(printer);
    professors.forEach(System.out::println);
  }
  public static <T> List<T> getList(T... elements) {
    return Arrays.asList(elements);
  }
}
