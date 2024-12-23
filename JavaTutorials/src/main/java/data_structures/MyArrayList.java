/*
 * ArrayList:
 * 
 * Syntax:
 *         ArrayList<Type> arrayListName = new ArrayList<Type>();
 */

package data_structures;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> integerAL = new ArrayList<Integer>();
		System.out.println(integerAL);
		integerAL.add(15);
		System.out.println(integerAL);
		integerAL.add(56);
		integerAL.add(1);
		integerAL.add(4);
		integerAL.add(null);
		System.out.println(integerAL);
		integerAL.add(2, 454);
		System.out.println(integerAL);

	}

}
