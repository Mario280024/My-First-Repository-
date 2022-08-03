 /*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
  */
import java.util.Scanner;
class ShopDiscount {
  public static void main (String[]Args) {
  Scanner TextInput3 = new Scanner(System.in);
    int q = TextInput3.nextInt();
    int DS = q * 100;
    if (DS > 1000) {
      int NP = DS / 100 * 90;
        System.out.println(NP);
    }
    else {
      System.out.println(DS);
    }
  }
}