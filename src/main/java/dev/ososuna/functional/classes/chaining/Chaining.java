package dev.ososuna.functional.classes.chaining;

public class Chaining {
  
  public static void main(String[] args) {
    StringBuilder builder = new StringBuilder();
    builder.append("Hello")
      .append(" ")
      .append("World");    
  
    Chainer chainer = new Chainer();
    chainer.sayHi().sayBye();

  }

  static class Chainer {
    
    public Chainer sayHi() {
      System.out.println("Hi");
      return this;
    }

    public Chainer sayBye() {
      System.out.println("Bye");
      return this;
    }
  
  }
}
  