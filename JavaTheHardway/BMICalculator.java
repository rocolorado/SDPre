import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);
    double  feet, inches, pounds, m, kg, bmi;

    System.out.print( "Your height (feet only): " );
    feet = keyboard.nextDouble();

    System.out.print( "Your height (inches): " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();


    m = ( (feet*12+ inches) * .0254);
    kg = (pounds * .45359237);




    bmi = kg / (m*m);

    System.out.println( "YourBMI is " + bmi );
  }
}
//completed with study drills adding feet, inches and pounds and doing the calucations to convert to m,cm and kg)//
//please don't ask me to re create it again right now because it took all the brain power I have to get this figured out.//
//Hopefully my brain will start remembering all my math schooling from 30 years ago soon!   //
