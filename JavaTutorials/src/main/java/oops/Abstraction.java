/*
 * Abstraction: 
 * 
 * In general, abstract is existing in thought but not having a physical or concrete existence
 * 
 * Super Class --> Car
 * Sub Classes --> HatchBack, Sedan, SUV
 * 
 * Super Class --> HumanBeings --> 
 * 					Attributes--> legs, hands, eyes, nose.., 
 * 					Concrete/ implemented Functions--> eat, dance, walk, sing
 * 					Abstract method/ function--> reproductive system
 * Sub Classes --> Male, Female --> reproductive system
 * 
 * Abstract method is like a mandatory field in an application where unless one populate the mandatory field, form will not be submitted.
 * In similar manner we define a method without implementation and declare it as an abstract method. 
 * This restricts us to create an object from the abstract class unless we provide the implementation in its sub classes.
 * 
 * Abstract class --> class containing one or more abstract method/s.
 * Unimplemented method --> method which doesn't contain a body
 * Abstract method --> Unimplemented method with abstract keyword(Non-access modifier)
 * 
 */
package oops;

public class Abstraction {

	public static void main(String[] args) {
//		HumanBeings obj1 = new HumanBeings(); // Compile error: Cannot instantiate the type HumanBeings
		Male obj2 = new Male();
		obj2.eat();
		obj2.reproductive_system();

	}

}

abstract class HumanBeings{
	public void eat() { // Implemented method
		System.out.println("I'm eating");
	}
	
	public abstract void reproductive_system(); // abstract method; abstract keyword is mandatory
}

class Male extends HumanBeings{

	public void reproductive_system() {
		System.out.println("Reproductive system is implemented");
		
	}
	
}

