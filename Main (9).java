// Write a program to print absolute value of a number entered by user
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner TextInput1 = new Scanner(System.in);
    int Num1 = TextInput1.nextInt();
    if (Num1 >= 0) {
    System.out.println(Num1);
    }
    else {
      System.out.println(Num1 * -1);
    }
  }
}