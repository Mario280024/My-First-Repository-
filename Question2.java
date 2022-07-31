// variables for age of 3 people by user and determine oldest and youngest among them.
// PSVM
class Question2 {
  public static void main (String[]Args){
    int Age1 = 45;
    int Age2 = 100;
    int Age3 = 99;
    if ((Age1 > Age2 )&&(Age1 > Age3)) {
     if (Age2 < Age3) {
          System.out.println (Age1 + "is the oldest of all the ages and" + Age2 + "is the youngest.");
} else {
        System.out.println (Age1 + "is the oldest of all the ages and" + Age3 + "is the youngest.");
        }
} else if ((Age2 > Age3 )&&(Age2 > Age1)) {
      if (Age1 < Age3) {
          System.out.println (Age2 + "is the oldest of all the ages and" + Age1 + "is the youngest.");
} 
       else  {
        System.out.println (Age2 + "is the oldest of all the ages and" + Age3 + "is the youngest.");
        }
}
    else if ((Age3 > Age2 )&&(Age3 > Age1)) {
      if (Age2 < Age1) {
        System.out.println (Age3 + "is the oldest of all the ages and" + Age2 + "is the youngest.");
       
}
       else  {
        System.out.println (Age3 + "is the oldest of all the ages and" + Age1 + "is the youngest.");
        }
}
  }
}