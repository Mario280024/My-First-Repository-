// Write a program that has a variable of the value of 15.
// It says Welcome to Class + that variable
class Main {
  public static void main (String[]Args){
    int Num1 = 15;
    System.out.println("Welcome to Class " + Num1);
    // Now write an if-else condition which prints the largest of 2 numbers. Also create Num2 variable.
    int Num2 = 15;
    if (Num2 > Num1) {
    System.out.println("The largest of the 2 numbers is " + Num2);
}
    else if (Num2 == Num1) {
       System.out.println("The two numbers are equal to " + Num2);
    }
    else {
      System.out.println("The largest of the 2 numbers is " + Num1);
}
  }
}