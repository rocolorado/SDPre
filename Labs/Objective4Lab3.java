import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: " );
    userNum = scanner.nextInt();

    if (userNum >0){
      System.out.println("The number is positive" );
    }
    if (userNum < 0){
      System.out.println("The number is negitive" );
    }






    scanner.close();

//take in a number from the user and determine if the number is greater than, less than or equal to 0.  print the findings//
// Please enter a number: 3 The number is positive//

  }
}
