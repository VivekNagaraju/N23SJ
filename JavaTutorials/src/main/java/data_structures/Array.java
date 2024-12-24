/*
 * Array: An array is a DS which stores multiple elements of the same data type.
 * 
 * Syntax:
 * 
 * 1. Creation of arrays without values (declare, not initialization)
 * dataType[] arrayName = new dataType[size];
 * 
 * OR
 * 
 * dataType arrayName[];
 * arrayName = new dataType[size];
 * 
 * 2. Creation of arrays with values:
 * 
 * dataType arrayName[] = {list of 'dataType' values separated by commas};
 * 
 * Characteristics:
 * 
 * 1. Homogeneous: Only elements of the same dataType can be stored
 * 2. Fixed size: Size of an array can't be altered once created
 * 3. Positive indexing: We can access the elements using positive index
 * 
 * Accessing elements using Enhanced for loop (for-each loop):
 * 
 * For-each loop is simplified version of 'for' loop used to iterate over DS without using index
 * 
 * Advantages: Simple syntax --> Reduces code complexity
 * 
 * Disadvantage or for/ for-each loop: You can't access any element directly using index
 * 
 * Disadvantages of an array:
 * >> Fixed size
 * >> No way/ Pre--defined methods to add/insert new elements or delete existing elements
 * >> We can't store different types of data in an array
 * 
 * 
 * Iteration: accessing elements of a DS one after the other starting from 0th index
 */
package data_structures;

public class Array {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 5;
		a[2] = 5;
		a[3] = 5;
		a[4] = 5;
//		a[5] = 5; // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		
		
		int b[];
		b = new int[5];
		
		int c[] = {2, 5, 3, 4, 6};
		System.out.println(c[2]);
//		System.out.println(c[-6]); // Negative index is not supported in java
		System.out.println("==========For loop===========");
		double d[] = {4, 5.6, 5.898, 6, 7};
		for(int i=0; i<d.length; i++) {
			System.out.println(d[i]);
		}
		System.out.println("==========For-each loop===========");
		
		for(double element : d) {
			System.out.println(element);
		}

	}

}
