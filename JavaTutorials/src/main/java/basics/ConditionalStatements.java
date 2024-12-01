/*Types of Conditional Statements:
1. If statement
2. If-else statement
3. If-else-If statements
4. Nested If statements
 */
package basics;

public class ConditionalStatements {

	public static void main(String[] args) {
		int age;
		age=65;
		/*
		if(age>18) {
			
			  if(age>60) { 
				  System.out.println("You're a senior citizen"); 
				  }else {
					  System.out.println("You're an adult");
					  }
		}else if (age>12) {
			System.out.println("You're a teenager");
		}else {
			System.out.println("You're a child");
		} 
		*/
		
		/*
		if(age>18 && age <60) {
			System.out.println("You're an adult");
		}else if(age<18 && age>12) {
			System.out.println("You're a teenager");
		}else if(age<12) {
			System.out.println("You're a child");
		}else {
			System.out.println("You're a senior citizen"); 
		}
		*/
		
		int number;
		number=3;
		
		if(number==1) {
			System.out.println("Your language is changed to Kannda");
		} else if(number==2) {
			System.out.println("Your language is changed to Urdu");
		}else if(number==3) {
			System.out.println("Your language is changed to English");
		}
	

	}

}
