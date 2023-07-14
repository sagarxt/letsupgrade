package Assignments.java.a1;

import java.util.Scanner;

public class MaxNumber {
  public static void main(String[] args) {
    var input = new Scanner(System.in);
    System.out.print("Enter the size of the Array: ");
    int size = input.nextInt();
    int[] numbers = new int[size];
    System.out.println("Enter the values of the array elements: ");
    for (int i = 0; i < size; i++) {
      numbers[i] = input.nextInt();
    }
    int index = 0;
    int max = numbers[0];
    for (int i = 0; i < size; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
        index = i;
      }
    }
    System.out.println("Maximum number: " + max);
    System.out.println("Position of First Occurrence: " + index);
  }
}
