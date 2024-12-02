/*
 Branching statements/ loop control statements:
  	1. Break: Break statement breaks the execution of a loop once particular condition is meet
  	2. Continue: Continue statement skips the execution of loop upon matching condition
  	 OR Whenever continue statement is encountered the execution of statements after it will be skipped 
  	 and control is returned back to the loop
 */
package basics;

public class BrachingStatements {

	public static void main(String[] args) {
		/*
		int row=1;
		while(true) {
			System.out.println(row);
			
			if(row == 18) {
				break;
			}
			
			row++;
		}
		System.out.println("Outside of the loop");
		*/
		
		/*
		for(int row=1; row>=0; row++) {
			System.out.println(row);
			if(row == 99) {
				break;
			}
		}
		System.out.println("Outside of the loop");
		*/
		
		/*
		int i=1;
		while(i<=100) {
			if(i%2==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		*/
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
