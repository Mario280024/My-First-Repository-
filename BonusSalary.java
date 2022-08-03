// A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount.
import java.util.Scanner;
class BonusSalary {
  public static void main (String[]Args) {
    Scanner TextInput2 = new Scanner (System.in);
    int Salary = TextInput2.nextInt();
    int YOS = TextInput2.nextInt();
    int NB = Salary / 100 * 5;
    if (YOS > 5) {
     System.out.println(NB);
    }
    else {
      System.out.println("You do not have a net bonus.");
    }
    }
}
