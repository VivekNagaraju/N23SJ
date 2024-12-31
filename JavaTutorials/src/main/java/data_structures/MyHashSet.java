/*
 * Hash Set: HashSet is a class of the Set Interface which is part of Java collection framework
 * 
 * Characteristics:
 *  - HashSet doesn't allow duplicate values
 *  - HashSet is an unordered collection --> Insertion order is not preserved
 *  - HashSet doesn't support indexing, instead it is based on Hashing Technique
 *  
 * Hashing Technique: Data/ elements are stored in key-value pairs which is helpful in efficient retrieval 
 * of values based on keys.
 */
package data_structures;

import java.util.ArrayList;
import java.util.HashSet;

public class MyHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hash_set1 = new HashSet<Integer>();
		System.out.println(hash_set1);
		hash_set1.add(15);
		hash_set1.add(10);
		hash_set1.add(5);
		hash_set1.add(20);
		System.out.println(hash_set1);
		hash_set1.add(5);
		System.out.println(hash_set1);
		ArrayList<Integer> integerAL = new ArrayList<Integer>();
		integerAL.add(15);
		integerAL.add(56);
		integerAL.add(1);
		integerAL.add(4);
		integerAL.add(null);
		System.out.println(integerAL);
		hash_set1.addAll(integerAL);
		System.out.println(hash_set1);
		HashSet<Integer> hash_set2 = new HashSet<Integer>();
		hash_set2.add(3);
		hash_set2.add(10);
		hash_set2.add(7);
		hash_set2.add(9);
		System.out.println(hash_set2);
		hash_set1.addAll(hash_set2);
		System.out.println(hash_set1);
		System.out.println("==========Accessing elements using For-each loop===========");
		for(Integer element : hash_set1) {
			System.out.println(element);
		}
		

	}

}
