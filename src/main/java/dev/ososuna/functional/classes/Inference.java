package dev.ososuna.functional.classes;

import java.util.List;
import java.util.function.Function;

public class Inference {
  public static void main(String[] args) {
    Function<Integer, String> converterFunction = integer -> "Double: " + integer * 2;
    List<String> students = NameUtils.getList("John", "Paul", "George", "Ringo");
    students.forEach(System.out::println);
  }
}
