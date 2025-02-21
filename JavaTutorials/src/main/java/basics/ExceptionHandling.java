/*
 * Exception handling:
 *  1. Logical implementation - first priority is given to this
 *  2. Try-catch implementation - this is used as last sort out method
 *  
 *  try
 *  {
 *    statements which might throw exceptions
 *  }
 *  catch
 *  {
 *    correction measures/ work-around to the exception thrown
 *  }
 *  finally
 *  {
 *    clean-up steps
 *  }
 *  
 */
package basics;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		int a = 87;
		int b = 0;
		System.out.println("a+b=" + (a+b));
		System.out.println("a-b="+(a-b));
		
		try {
			System.out.println("a/b="+(a/b));
		}
		catch (ArithmeticException ae)
		{
			System.out.println(ae);
		}
		
		System.out.println("a*b="+(a*b));
	}

}
