package basics;

public class Operators {

	public static void main(String[] args) {
		/* Modulus Operator: % */
		int a = 673;
		int b = 900;
		int c = a % b;
		System.out.println(c);
		
		System.out.println("-------increment/decrement-------");
		System.out.println("a="+a);
		int d=a--; // Post-decrement
		System.out.println("a after Post-decrement"+a); // 672
		System.out.println("d="+d);
		int e=--a; // Pre-decrement
		System.out.println("a after Pre-decrement"+a); // 671
		System.out.println("e="+e);
		System.out.println("b="+b);
		int f=b++; // Post-increment
		System.out.println("b after Post-increment"+b); // 6a/5f
		System.out.println("f="+f);
		int g=++b; // Pre-increment
		System.out.println("b after Pre-increment"+b); // 7
		System.out.println("g="+g);
		
		System.out.println("-------Relational Operators-------");
		System.out.println(a>b);
		System.out.println(a<b);
		
		System.out.println("-------Logical Operators-------");
		System.out.println("AND GATE");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("OR GATE");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("NOT GATE");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println("------Ternary Operator-------");
		a=8;
		b=10;
		System.out.println((a>b)?a:b);
		
		System.out.println("---------Precedence and associativity--------");
		int m, n, o, p;
		
		  m= 64; n= 8; o=4; p=2;
		 
//		m=n=o=p=67;
		
//		int z = m+n*o-p;
//		double z = m*n*o/p;
//		System.out.println(z);
		  double result = 7-4+2;
		  System.out.println(result);

	}

}
