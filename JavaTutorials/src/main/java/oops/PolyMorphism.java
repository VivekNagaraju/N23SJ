/*Polymorphism:
 * Poly= many
 * Morph= forms
 * 
 * Polymorphism is the ability of an entity to take several/many forms
 * 
 * Ex: Operator overloading (+ sign)
 * 
 * Types of polymorphism:
 * 
 * 1. Compile-time polymorphism/ Static pulymorphism/ Early binding
 * 		- Compile time polymorphism is achieved during compile time through method overloading
 * 		- Method overloading is having multiple methods with same name in the same class 
 * 			but with different parameters/ arguments
 * 		- method overloading can be achieved:
 * 			> By changing the number of arguments/ parameters
 * 			> By changing the data type of arguments
 * 2. Run-time polymorphism/ Dynamic polymorphism/ Late biinding
 * 		- Run time polymorphism is achieved during run time through method overriding
 * 		- Method overriding is providing implementation to a method in sub class,
 * 		 which is already defined in its superclass
 * 
 */
package oops;

public class PolyMorphism {

	public static void main(String[] args) {
		Maths obj = new Maths();
		obj.sum(5, 6);
		obj.sum(5.7, 8.7);
		obj.sum(6.7, 8.9, 6.9);

	}

}

class Maths{
	public void sum(int a, int b) {
		int total=a+b;
		System.out.println(total);
	}
	
	public void sum(double a, double b) {
		double total=a+b;
		System.out.println(total);
	}
	
	public void sum(int a, int b, int c) {
		int total=a+b+c;
		System.out.println(total);
	}
	
	public void sum(double a, double b, double c) {
		double total=a+b+c;
		System.out.println(total);
	}
}