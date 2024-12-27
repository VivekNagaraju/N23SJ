/*
 * ArrayList:
 * 
 * Syntax:
 *         ArrayList<Type> arrayListName = new ArrayList<Type>();
 * 
 * Size: the number of elements that are stored in a Collection
 * Capacity: the memory allocated for the elements
 * 
 * Iterator: Iterator is an object that allows you to traverse elements of a collection
 */

package data_structures;

import java.util.ArrayList;
import java.util.Iterator;

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
		System.out.println("integerAL:"+integerAL);
		ArrayList<Integer> integerAL2= (ArrayList<Integer>) integerAL.clone();
		System.out.println("integerAL2:"+integerAL2);
		integerAL.addAll(integerAL2);
		System.out.println(integerAL);
		integerAL.addAll(2, integerAL2);
		System.out.println(integerAL);
//		integerAL2.clear();
		System.out.println("integerAL2:"+integerAL2);
		System.out.println(integerAL.contains(15));
		System.out.println(integerAL.containsAll(integerAL2));
		ArrayList<Integer> integerAL3= (ArrayList<Integer>) integerAL2.clone();
		integerAL3.add(45);
		System.out.println("integerAL3:"+integerAL3);
		integerAL3.add(45);
		System.out.println(integerAL3.equals(integerAL2));
		System.out.println(integerAL.get(4));
		System.out.println("==========For loop===========");
		for(int i=0; i<integerAL.size(); i++) {
			System.out.println(integerAL.get(i));
		}
		System.out.println("==========For-each loop===========");
		for(Integer element : integerAL) {
			System.out.println(element);
		}
		
		System.out.println("==========For-each method for an arraylist===========");
		integerAL.forEach(element -> System.out.println(element));
		
		System.out.println("==========iterator===========");
		 Iterator<Integer> iterator = integerAL.iterator();
		 
		 while(iterator.hasNext()) {
			 Integer element = iterator.next();
			 System.out.println(element);
		 }
		 
		 System.out.println("==========indexOf===========");
		 System.out.println(integerAL.indexOf(15));
		 
		 System.out.println("==========lastIndexOf===========");
		 System.out.println(integerAL.lastIndexOf(15));
		 
		 
	

	}

}
