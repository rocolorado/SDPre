import java.util.Scanner;

public class ComparingNumbers {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print( "Give me two numbers. First: " );
    first = keyboard.nextDouble();
    System.out.print( "Second: " );
    second = keyboard.nextDouble();

    if ( first < second )
      System.out.println( first + " is LESS THAN " + second );

    if ( first <= second )
      System.out.println( first + " is LESS THAN / EQUAL TO " + second );

    if ( first == second )
      System.out.println( first + " is EQUAL TO " + second );

    if ( first >= second )
      System.out.println( first + " is GREATER THAN / EQUAL TO " + second );

    if ( first > second )
      System.out.println( first + " is GREATER THAN " + second );

    if ( first != second ){
      System.out.println( first + " is NOT EQUAL TO " + second );
      System.out.println( "Hey." );
    }
  }
}
// study drill adding Hey statement to end of code.  It ran even though there are not//
// curly brackets on the last if statement.  Im assuming because it doesn't have a qualifier//
// and its a 'hard" print out line???? not sure.   Removed all curly braces from if statements//
// and added to the last statement so the Hey was included in the bracket and worked the same.  //
