package singleton.lazyinitialize;
/*
 * Lazy initialization implementation of Singleton
 */
public class Singleton3 {

	private static Singleton3 instance;
	
	private Singleton3() {
		/*
		 * Private constructor
		 */
	}
	
	public static Singleton3 getInstance() {
		if (instance == null) {
			/*
			 * if instance is null, then initialize
			 */
			instance = new Singleton3();
		}
		return instance;
	}
	
	public void printTest() {
		System.out.println("Printing from inside Singleton - Lazy initialize");
	}
	
}
