/*
 * User Input --> Scanner Class
 * Scanner class is present in java.util package
 */
package basics;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		double a;
		double b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		a=sc.nextDouble();
		System.out.println("Enter another number:");
		b=sc.nextDouble();
		double total = a + b;
		System.out.println("Sum of above 2 numbers is:" + total);
		sc.close();

	}

}
