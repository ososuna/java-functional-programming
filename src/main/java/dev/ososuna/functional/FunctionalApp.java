package dev.ososuna.functional;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class FunctionalApp {
  public static void main( String[] args ) {
    Function<Integer, Integer> square = new Function<Integer,Integer>() {
      @Override
      public Integer apply(Integer x) {
        return x*x;
      }
    };

    System.out.println(square.apply(6));
    System.out.println(square.apply(25));
    System.out.println(square.apply(5));
  
    Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

    Predicate<Integer> isEven = x -> x % 2 == 0;

    Predicate<Student> isApproved = student -> student.getGrade() > 6.0;

    Student student = new Student(5.9);
    System.out.println(isApproved.test(student));
    System.out.println(isOdd.apply(3));
    System.out.println(isEven.test(6));

  }

  static class Student {

    private double grade;

    public Student(double grade) {
      this.grade = grade;
    }

    public double getGrade() {
      return grade;
    }

    public void setGrade(double grade) {
      this.grade = grade;
    }

  }

  static int square(int x) {
    return x*x;
  }
}