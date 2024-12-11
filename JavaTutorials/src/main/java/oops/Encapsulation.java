/*
 * Encapsulation: Restricting the access to data members(attributes/methods/constructors) of a class.
 * 
 * We implement encapsulation to protect the data --> Data integrity
 * 
 * Capsule --> Protective layer/ shell which restricts access to the inner contents.
 * 
 * ATM withdrawal scenario:
 * 1. Insert card 
 * 2. validity of the card
 * 3. Enter the PIN number
 * 4. Validity of PIN number
 * 5. Selecting type of bank account
 * 6. Validity of bank account
 * 7. Enter the amount
 * 8. If the amount is positive, multiples of 100/500 and if there is sufficient balance in the account
 * 9. Dispense the cash
 * 10. Collect cash
 * 11. Deduct the cash withdrawal from the account and update the latest balance
 * 12. End the transaction
 */
package oops;

public class Encapsulation {

	public static void main(String[] args) {
		Account account_holder = new Account();
		account_holder.deposit(100);
		/*
		account_holder.account_balance = -100; // hacker changed the balance to -100
		account_holder.deposit(100);
		*/
		account_holder.get_balance();
	

	}

}

class Account{
	private int account_number;
	private int account_balance; // The field Account.account_balance is not visible
	
	public void deposit(int amount) { // setter method: it is updating/ setting the account_balance
		if (amount < 0) {
			System.out.println("Enter valid amount");
		} else {
			account_balance = account_balance + amount;
			System.out.println("Current balance is " + account_balance);
		}
		
	}
	
	public void get_balance() { // Getter method to get the data of private variable
		System.out.println("Current balance is " + account_balance);
	}
	
}
