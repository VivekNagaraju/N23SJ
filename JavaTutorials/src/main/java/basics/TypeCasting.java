package basics;

public class TypeCasting {

	public static void main(String[] args) {
		int a = 5;
		System.out.println(a);
		
//		float b = (float)a; // explicit
		float b = 6.87f; // implicit
		System.out.println(b);
		
		int c = (int) b;
		System.out.println(c);
		
		/* Explicit type casting examples */
		
		byte d = 23;
		int e = d;
		
		int f = 128;
		byte g = (byte) f;
		System.out.println(g);
		
		char h = 'a';
		int i = h;
		System.out.println(i);
		
		int j = 65;
		char k = (char)j;
		System.out.println(k);

	}

}
