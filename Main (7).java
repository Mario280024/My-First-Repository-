
class Main {
  public static void main(String[] args) {
    double NumberOfClassesHeld = 257.0;
    double NumberOfClassesAttended = 74.0;
    if (NumberOfClassesAttended / NumberOfClassesHeld < 0.75) {
      System.out.println("The percentage of class attendancy is "
          + (NumberOfClassesAttended / NumberOfClassesHeld * 100) + "%. The student is not allowed to sit in class.");
    } else {
      System.out.println("The percentage of class attendancy is "
          + (NumberOfClassesAttended / NumberOfClassesHeld * 100) + "%. The student is allowed to sit in class.");
    }
  }
}