package dev.ososuna.functional.classes.lambda;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import dev.ososuna.functional.classes.NameUtils;

public class Syntaxis {
  public static void main(String[] args) {
    List<String> courses = NameUtils.getList("Java", "Python", "C++", "C#");
    courses.forEach(course -> System.out.println(course));
    useZero(() -> 2);
    usePredicate(text -> text.isEmpty());
    useBiFunction((text, number) -> text + number);
    useBiFunction((text, number) -> {
      System.out.println("Text: " + text);
      System.out.println("Number: " + number);
      return text + number;
    });
    useNothing(() -> {
      System.out.println("Nothing");
    });
  }

  static void useZero(ZeroArguments zeroArguments) { 

  }

  static void usePredicate(Predicate<String> predicate) {

  }

  static void useBiFunction(BiFunction<Integer, Integer, Integer> operation) {

  }

  static void useNothing(DoNothing doNothing) {

  }

  @FunctionalInterface
  interface ZeroArguments {
    int get();
  }

  @FunctionalInterface
  interface DoNothing {
    void nothing();
  }

}
