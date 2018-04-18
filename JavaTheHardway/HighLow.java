import java.util.Scanner;

public class HighLow {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
    int secret, guess;

    secret = 1 + (int)(100*Math.random() );

    System.out.println( "I'm thinking of a number between 1-100.");
    System.out.println( "Try to guess it! " );
    System.out.print( "> " );
    guess = keyboard.nextInt();

    while ( secret != guess ){
      if (guess < secret ){
        System.out.print( "Sorry, your guess is too low. " );

      }
      if (guess > secret ){
        System.out.print( " Sorry your guess is too high. " );

      }
      System.out.print( "Try again. \n> " );
      guess = keyboard.nextInt();
    }

  System.out.println( "You guessed it!  What are the odds!?!" );
}
}
// study drill condense code so you don't have to write 2 if statements- //
//moved try again to run after the if loop to try again happens after it runs one or the other if statements. //
