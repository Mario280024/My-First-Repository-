class Main {
  public static void main(String[] args) {
    int YourGrade = 90;
    if (YourGrade >= 90) {
      System.out.println("You have an A grade!! You Pass!!!");
    }
    else if (YourGrade >= 80) {
        System.out.println("You have an B grade!! You Pass!!");
    }  else if (YourGrade >= 70) {
        System.out.println("You have an C grade!! You Passed but you nearly flunked it!");
    } else if (YourGrade >= 60) {                     
        System.out.println("You have an D grade!! You Flunked It...");
    } else if (YourGrade < 60) {
        System.out.println("You have a F grade... You didn't pass at all.......");
    }
  }
}