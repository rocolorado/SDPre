import java.util.Scanner;

public class Objective3Lab1 {
  public static void main( String[] args){
    String userInput = "";
    Scanner input  = new Scanner(System.in);

    System.out.println("Please Type a word: ");
    userInput = input.next();
    System.out.println( userInput );
System.out.println( userInput );
//this one was tricky with the missing import statement at the top!!//
    input.close();
  }
}
