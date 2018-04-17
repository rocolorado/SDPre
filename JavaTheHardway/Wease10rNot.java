import java.util.Scanner;

public class Wease10rNot {
  public static void main (String [] args ){
    Scanner keyboard = new Scanner (System.in);
    String word;
    boolean yep, nope;

    System.out.println( "Type the word \"weasel\", please." );
    word = keyboard.next();

    yep = "weasel".equals(word);
    nope = ! word.equals("weasel" );

    System.out.println( "You typed what was requested: " + yep );
    System.out.println( "You ignored polite instructions: " + nope );

  }
}
// switched places with word and weasel on line 12 for study drill.  Originally written://
// yep=word.equals("weasel"); but still works with the words switched. //
