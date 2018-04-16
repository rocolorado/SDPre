import java.util.Scanner;

public class RudeQuestions {
  public static void main( String [] args ) {
    String name;
    int age;
    double weight, shoesize, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello, What is your name?" );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you?" );
    age = keyboard.nextInt ();

    System.out.println( "So, you're " + age + ", eh? That's not very old. " );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );

    System.out.print( "What size shoe do you wear " + name + "?" );
    shoesize = keyboard.nextDouble();


    System.out.println( "Wow a size " + shoesize + "!");
    System.out.print( "Finally, what's your income, " + name + "?" );
    income=keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well thanks for answering my rude questions, " );
    System.out.println( name + "." );
  }
}
// Study drill- it doesn't blow up with a number like 248 as a name, but Im guessing its because a word or phrase could still be a number. //
//It doesn't like donut as an answer to weight though and gives me an error and doesn't go on to the next question. Im guessing becuase //
// it can't move on until it gets an acceptable value.  //
