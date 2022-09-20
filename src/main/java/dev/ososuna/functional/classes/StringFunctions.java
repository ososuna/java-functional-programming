package dev.ososuna.functional.classes;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
  public static void main(String[] args) {
    UnaryOperator<String> quote = text -> "\"" + text + "\"";
    UnaryOperator<String> addMark = text -> text + "!";
    System.out.println(quote.apply("Hello world"));
    System.out.println(addMark.apply("Hello world"));

    BiFunction<Integer, Integer, Integer> multiplyBiFunction = (a, b) -> a * b;
    BinaryOperator<Integer> multiply = (a, b) -> a * b;
    System.out.println(multiplyBiFunction.apply(2, 3));
    System.out.println(multiply.apply(2, 3));

    BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);
    System.out.println(leftPad.apply("Hello", 10));

  }
}
