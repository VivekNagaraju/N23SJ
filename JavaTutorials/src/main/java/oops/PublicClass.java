package oops;

public class PublicClass {
	public void pc_m1() {
		System.out.println("This is a method from public class");
	}

public static void main(String[] args) {
	
	ProtectedClass protectedObject = new ProtectedClass();
	protectedObject.protected_method();
	
}

}

class ProtectedClass{
	protected void protected_method() {
		System.out.println("This is a method from protected class");
	}
}


