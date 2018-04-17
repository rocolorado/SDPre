import java.util.Scanner;

public class AgeMessages {
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.print( "How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "You are: " );
    if ( age < 13 ) {
      System.out.println("\ttoo young to create a Facebook account" );
    }
    if ( age >= 13 ){
      System.out.println("\tYou can create a Facebook account");
    }
    if ( age < 16 ) {
      System.out.println("\ttoo young to get a drivers's license" );
    }
    if ( age >= 16 ){
      System.out.println("\tYou can get a driver's license" );
    }
    if ( age < 18 ) {
      System.out.println("\ttoo young to get a tattoo" );
    }
    if ( age >= 18 ) {
      System.out.println("\tYou can get a tattoo" );
    }
    if ( age < 21 ) {
      System.out.println("\ttoo young to drink alcohol" );
    }
    if ( age >=21 ){
      System.out.println("\tYou can get a drink!");
    }
    if ( age < 35 ) {
      System.out.println("\ttoo young to run for President of the U.S." );
    }
    if ( age >= 35 ){
      System.out.println("\tYou can run for President" );
    }
    if ( age >= 65 ) {
      System.out.println("\tYou are old enough to retire!" );
    }
    if ( age < 65 ){
      System.out.println("\tYou are too young to retire! ");
      System.out.println( "\t\t(How sad!)" );
    }



  }

}

// study drill- typing an age greater than 35 you don't get any messages displayed because all statements are false.//
// added if statements to get 6 messages displayed no matter the age//
