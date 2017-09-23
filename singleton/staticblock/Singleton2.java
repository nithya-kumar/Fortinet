package singleton.staticblock;
/*
 * Static block implementation of Singleton
 */
public class Singleton2 {

	public static Singleton2 instance;
	
	private Singleton2() {
		/*
		 * Private constructor
		 */
	}
	
	{
		instance = new Singleton2();
	}
	
	public static void printTest() {
		System.out.println("Printing from inside Singleton - Static block");
	}
	
}
