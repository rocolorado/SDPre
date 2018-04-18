import java.util.Scanner;

public class Objective4Lab4{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number;

    System.out.println( "Please enter a number: " );
    number = scanner.nextInt();

    if (number % 2 == 0){
      System.out.println("The number is even");
    }
    else{
      System.out.println("The number is odd");
    }
  }
}
