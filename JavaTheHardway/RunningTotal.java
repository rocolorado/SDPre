import java.util.Scanner;

public class RunningTotal {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in );
    int current, total = 0;

    System.out.print ("Type in a bunch of values and I'll add them up. " );
    System.out.println("I'll stop when you type a zero." );
    System.out.print("Value: " );
    current = keyboard.nextInt();

    while (current != 0) {


      total += current;
      System.out.println("The total so far is: " + total );
      System.out.println(" Enter a value: ");
      current = keyboard.nextInt();
    }


    System.out.println("The final total is: " + total );
  }
}
//study drill- rewrite to do a while loop instead of do while  Add/change something
//before the loop starts so that it compiles and make sure it still works  Then chage it back to a do while
//and leave in whatever you chaged to make the while loop version compile.
//then fix the code so the total so far/final total skips printing at the end but prints the rest of the time.
