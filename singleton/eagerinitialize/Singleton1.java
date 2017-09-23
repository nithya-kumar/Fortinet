package singleton.eagerinitialize;
/*
 * Easy initialization implementation of Singleton
 */
public class Singleton1 {

	public static Singleton1 instance = new Singleton1();
	
	private Singleton1() {
		/*
		 * Private constructor
		 */
	}
	
	public static void printTest() {
		System.out.println("Printing from inside Singleton - Eager initialize");
	}
	
}
