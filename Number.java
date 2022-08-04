// Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
import java.util.Scanner;
class Number {
  public static void main(String[]Args) {
    Scanner TextInput2 = new Scanner (System.in);
   int Num5 = TextInput2.nextInt();
    if (Num5 == 1) {
      System.out.println("Monday");
    }
     else if (Num5 == 2) {
      System.out.println("Tuesday");
    }
    else if (Num5 == 3) {
      System.out.println("Wednesday");
    }
    else if (Num5 == 4) {
      System.out.println("Thursday");
    }
    else if (Num5 == 5) {
      System.out.println("Friday");
    }
    else if (Num5 == 6) {
      System.out.println("Saturday");
    }
    else if (Num5 == 7) {
      System.out.println("Sunday");
    }
  }
}