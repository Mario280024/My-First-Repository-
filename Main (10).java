// Welcome to class 18 (18 is an input by the user)
import java.util.Scanner;
class Main {
  public static void main(String[]Args) {
    Scanner TextInput1 = new Scanner(System.in);
    int Num1 = TextInput1.nextInt();
    System.out.println("Welcome to Chapter " + Num1 + "!!!");
    /*  Now Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.
    */
    int Num3 = 400;
    int Num4 = 4;
    int Num2 = TextInput1.nextInt();
    if (Num2 % Num3 == 0) {
      System.out.println("It is a leap year");
    }
    else if (Num2 % Num4 == 0) {
       System.out.println("It is a leap year");
    }
    else {
       System.out.println("It is  not a leap year");
    }
    // Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
    
}
}