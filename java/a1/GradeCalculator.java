package Assignments.java.a1;

import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args) {
    var input = new Scanner(System.in);
    System.out.print("Enter your grade: ");
    int grade = input.nextInt();
    calculateGrade(grade);
  }

  static void calculateGrade(int grade) {
    if (grade <= 100 && grade >= 0) {
      if (grade >= 90) {
        System.out.println("Grade: A");
      } else if (grade >= 80) {
        System.out.println("Grade: B");
      } else if (grade >= 70) {
        System.out.println("Grade: C");
      } else if (grade >= 60) {
        System.out.println("Grade: D");
      } else if (grade >= 50) {
        System.out.println("Grade: E");
      } else {
        System.out.println("Grade: F");
      }
    } else {
      System.out.println("Invalid grade");
    }
  }
}