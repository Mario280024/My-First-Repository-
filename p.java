import java.util.Scanner;
class p {
  public static void main(String[]Args) {
    Scanner TextInput3 = new Scanner (System.in);
    int Num3 = TextInput3.nextInt();
     int rrr1 = 0; 
    while (Num3 != 0) {
      int w33556 = Num3 % 10;
      rrr1 = rrr1 * 10 + Num3;
      Num3 = Num3/10;
    } 
    if (rrr1 == Num3) {
      System.out.println("It is a palindrome.");
    }
    else {
      System.out.println("It is not a palindrome.");
    }
  }
}