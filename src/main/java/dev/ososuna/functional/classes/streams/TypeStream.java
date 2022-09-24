package dev.ososuna.functional.classes.streams;

import java.util.stream.IntStream;

public class TypeStream {
  public static void main(String[] args) {
    IntStream inifinteStream = IntStream.iterate(0, x -> x + 1);
    inifinteStream.limit(1000)
      .parallel()
      .filter(x -> x % 2 == 0)
      .forEach(System.out::println);
  }
}
