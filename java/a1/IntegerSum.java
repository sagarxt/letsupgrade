package Assignments.java.a1;

import java.util.Scanner;

public class IntegerSum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first Integer: ");
    int integer1 = input.nextInt();
    System.out.print("Enter second Integer: ");
    int integer2 = input.nextInt();
    System.out.print("Enter third Integer: ");
    int integer3 = input.nextInt();
    System.out.print("Enter fourth Integer: ");
    int integer4 = input.nextInt();
    System.out.print("Enter fifth Integer: ");
    int integer5 = input.nextInt();
    System.out.println("Sum of all integers: " + (integer1 + integer2 + integer3 + integer4 + integer5));
  }
}
