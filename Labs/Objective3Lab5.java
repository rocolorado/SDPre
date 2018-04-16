import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args){
  Double number1, number2, sum;

  Scanner input = new Scanner(System.in);

  System.out.println("Please enter a number: ");
  number1 = input.nextDouble();

  System.out.println("Please enter another number: ");
  number2 = input.nextDouble();
  sum= number1+number2;

  System.out.println("The sum of " + number1 + " + " + number2 + " = " + sum);

  input.close();

  }
}
