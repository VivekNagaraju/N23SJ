package oops;

public class Inheritance {

	public static void main(String[] args) {
		System.out.println("--------Grand Father Object---------");
		GrandFather ajja = new GrandFather("abc");
		ajja.gfmethod();
		ajja.watch();
		
		System.out.println("--------Father Object---------");
		Father appa = new Father("xyz");
		appa.fmethod();
		appa.gfmethod();
		appa.watch();
		
		System.out.println("--------Child Object------------");
		Child naanu = new Child("mno");
		naanu.cmethod();
		naanu.gfmethod();
		naanu.fmethod();
		naanu.watch();
		
		/*
		HumanBeing obj2 = new HumanBeing("Tanuja", 16, "female");
		obj2.eat();
		*/

	}
	

}

class GrandFather{
	String name;
	public GrandFather(String inputname) {
		System.out.println("This is Grand Father Constructor");
	}
	
	public void gfmethod() {
		System.out.println("This is Grand Father method");
	}
	
	public void watch() {
		System.out.println("This is Grand Father's watch");
	}
}

class Father extends GrandFather{

	public Father(String inputname) {
		super(inputname);
		System.out.println("This is Father class constructor");
	}
	public void fmethod() {
		System.out.println("This is father method");
	}
	

	public void watch() {
		System.out.println("This is Father's watch");
//		super.watch();
	}
	
}

class Child extends Father{
	Child(String inputname){
		super(inputname);
		System.out.println("This is Child class constructor");
	}
	public void cmethod() {
		System.out.println("This is child method");
	}
}