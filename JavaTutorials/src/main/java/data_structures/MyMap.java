/*
 * Map: Map interface helps us to store data in Key-value pair.
 * 
 * Key can't be duplicated(Key is unique always).
 * There can be duplicate values.
 * 
 * HashMap- elements are not sorted by default. 
 * " This class makes no guarantees as tothe order of the map; 
 * in particular, it does not guarantee that the order will remain constant over time. "
 * 
 * TressMap- elements are sorted in natural order by default
 * "The map is sorted according to the naturalordering of its keys, 
 * or by a Comparator provided at mapcreation time, depending on which constructor is used. "
 * 
 * Syntax:
 *  MapClass<Key, Value> mapName = new MapClass<Key, Value>();
 */
package data_structures;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class MyMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(2, "Arshiya");
		hm.put(3, "Swaroop");
		
		hm.put(5, "Yashaswini");
		hm.put(1, "Anu");
		hm.put(4, "Tanuja");
		System.out.println(hm);
		System.out.println(hm.get(5));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(Collections.reverseOrder());
		tm.put(2, "Arshiya");
		tm.put(3, "Swaroop");
		
		tm.put(5, "Yashaswini");
		tm.put(1, "Anu");
		tm.put(4, "Tanuja");
		System.out.println(tm);
		System.out.println(tm.descendingMap());

	}

}
