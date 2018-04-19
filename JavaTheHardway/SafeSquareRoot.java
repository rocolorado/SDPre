import java.util.Scanner;

public class SafeSquareRoot {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String answer, Yes;


System.out.println(" Are you ready?!? (Yes or No)");
answer = keyboard.next();

while(!answer.equals("Yes")){
  System.out.println( "Ready?  (Yes or No)");
  answer= keyboard.next();


}

    System.out.print("Give me a number and I'll find its's square root. ");
    System.out.print("(No negatives, please.)");
    x = keyboard.nextDouble();

  while ( x < 0 ) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of "+x+" is "+y);
// study drill - add another protction loop toward top of program asking are you ready. don't go til yes//
  }
}
