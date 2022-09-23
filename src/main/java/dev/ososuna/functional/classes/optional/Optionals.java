package dev.ososuna.functional.classes.optional;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals {

  public static void main(String[] args) {
    List<String> names = getNames();
    if (names != null) {
      // operate with numbers
    }
    Optional<List<String>> optionalNames = getOptionalNames();
    if (optionalNames.isPresent()) {
      // operate with numbers
    }
    optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));
    Optional<String> valuablePlayer = optionalValuablePlayer();
    String valuablePlayerName = valuablePlayer.orElseGet(() -> "No valuable player");
    System.out.println(valuablePlayerName);
  }

  static List<String> getNames() {
    return Collections.emptyList();
  }

  static String mostValuablePlayer() {
    return null;
  }

  static int mostExpensiveItem() {
    return 0;
  }

  static Optional<List<String>> getOptionalNames() {
    List<String> names = new LinkedList<>();
    return Optional.of(names);
  }

  static Optional<String> optionalValuablePlayer() {
    try {
      return Optional.of("Messi");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return Optional.empty();
  }

}
