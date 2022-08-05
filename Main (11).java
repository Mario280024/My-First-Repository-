// Write a Java program to find the number of days in a month.
import java.util.Scanner;
class Main {
  public static void main(String[]Args) {
    Scanner TextInput2 = new Scanner (System.in);
    String Num1 = TextInput2.nextLine();
    if (Num1.equals("January")) {
      System.out.println("31");
    }
    else if (Num1.equals("February")) {
      System.out.println("28.5 on avg.");
    }
    else if (Num1.equals("March")) {
      System.out.println("31");
    }
    else if (Num1.equals("April")) {
      System.out.println("30");
    }
    else if (Num1.equals("May")) {
      System.out.println("31");
    
    }
    else if (Num1.equals("June")) {
      System.out.println("30");
    }
    else if (Num1.equals("July")) {
      System.out.println("31");
    }
    else if (Num1.equals("August")) {
      System.out.println("31");
    }
    else if (Num1.equals("September")) {
      System.out.println("30");
    }
    else if (Num1.equals("October")) {
      System.out.println("31");
    }
    else if (Num1.equals("November")) {
      System.out.println("30");
    }
    else if (Num1.equals("December")) {
      System.out.println("31");
    }
    else  { 
      System.out.println("error");
          }   
  }
}

