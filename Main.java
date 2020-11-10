
//Kyle McDowell
//Methods and operations with math 
import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter value for x:");
    int x = userInput.nextInt();
    System.out.println("Enter value for z");

    double z = userInput.nextDouble();

    bigMath bigdog = new bigMath(x, z);

    System.out.println("x + z = " + bigdog.addition(x, z));

    System.out.println("x - z =" + bigdog.subtraction(x, z));

    System.out.println("x*z = " + bigdog.multiplication(x, z));

    System.out.println("x/z = " + bigdog.division(x, z));

    System.out.println("the average of x and z = " + bigdog.average(x, z));

    System.out.println("The distance between x and z is = " + bigdog.distance(x, z));

    System.out.println("The maximum value is: " + bigdog.biggest(x, z));

    System.out.println("The minimum value is:" + bigdog.smallest(x, z));
  }

}