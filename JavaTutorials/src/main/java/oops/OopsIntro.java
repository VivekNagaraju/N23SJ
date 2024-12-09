package oops;

public class OopsIntro {

	public static void main(String[] args) {
		HumanBeing obj1 = new HumanBeing("Vivek", 31, "Male");
		obj1.walk();
		System.out.println(obj1.gender);
//		obj1.gender="Female"; // making changes to final variable is not allowed
		System.out.println(obj1.gender);

		HumanBeing obj2 = new HumanBeing("Arshiya", 16, "Female");
		obj2.walk();
		obj2.eat();
		obj1.eat();
		
		PublicClass Obj3= new PublicClass();
		Obj3.pc_m1();
	}
	
	

}


class HumanBeing {
	 String name;
	 int age;
	 final String gender;
	public HumanBeing(String inputname, int inputage, String inputgender) {
		name=inputname;
		age=inputage;
		gender=inputgender;
	}
	public void walk() {
		System.out.println(this.name + " is walking");
	}
	
	public void eat() {
		System.out.println(this.name + " is eating");
	}
}

