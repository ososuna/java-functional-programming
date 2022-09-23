package dev.ososuna.functional.classes.composition;

import java.util.function.Function;

public class MathOperations {
  public static void main(String[] args) {
    Function<Integer, Integer> mutiplyBy3 = x -> {
      System.out.println("Multiplying " + x + " by 3");
      return x * 3;
    };
    Function<Integer, Integer> add1MultiplyBy3 = mutiplyBy3.compose(y -> {
      System.out.println("Adding 1 to " + y);
      return y + 1;
    });
    Function<Integer, Integer> andSquare = add1MultiplyBy3.andThen(z -> {
      System.out.println("Squaring " + z);
      return z * z;
    });
    System.out.println(andSquare.apply(5));
  }
}
