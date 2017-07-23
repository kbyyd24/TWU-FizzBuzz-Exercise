package cn.yxgao.twu.fizzbuzz.exercise;

public class Main {
  public static void main(String[] args) {
    for (int i = 1; i < 101; i++) {
      String fizzBuzz = "";
      if (i % 3 == 0) fizzBuzz = "Fizz";
      if (i % 5 == 0) fizzBuzz += "Buzz";
      System.out.println(fizzBuzz.length() == 0 ? i : fizzBuzz);
    }
  }
}
