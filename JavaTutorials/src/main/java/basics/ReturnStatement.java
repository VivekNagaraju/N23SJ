/*
 * Return statement is used to exit from a "method". We use this return 
 * statement to send values to the method caller.
 */
package basics;

public class ReturnStatement {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int c= obj.add(3, 6);
		System.out.println(c);

	}

}

class Calculator{
	int add(int a, int b){
		int total = a + b;
		return total;
	}
}
