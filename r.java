// reverse a number 
import java.util.Scanner;
class r {
  public static void main(String[]Args) {
   Scanner TextInput2 = new Scanner (System.in);
    int Num2 = TextInput2.nextInt();
    int Nuehfg = 0;
    while (Num2 != 0) {
      int remainder = Num2 % 10;
      Nuehfg = Nuehfg * 10 + remainder;
      Num2 = Num2/10;
    }
    System.out.println(Nuehfg);
  }
}