package data_structures;


import java.util.TreeSet;

public class MySortedSet {

	public static void main(String[] args) {
		TreeSet<Integer> ss = new TreeSet<Integer>();
		ss.add(23);
		ss.add(56);
		ss.add(88);
		ss.add(24);
		ss.add(76);
		System.out.println(ss);
		TreeSet<Integer> ss_desc = (TreeSet<Integer>) ss.descendingSet();
		System.out.println(ss_desc);

	}

}
