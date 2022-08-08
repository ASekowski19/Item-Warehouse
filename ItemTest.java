package prob1;



public class ItemTest {

	public static void main(String[] args) {
		testConstructor();
		testItemCost();
		testToString();
		testEquals1();
		testEquals2();
		
	}
	
	/**
	 * Verify that the name & weight are initialized with the constructor.
	 */
	public static void testConstructor() {
		System.out.println("-->testConstructor"); 
		System.out.println("Expected: Name=Crackers, Cost= $4.50, Weight=2.25");
		item p = new item("Crackers", 2.25 );
		System.out.println(p); 
	}
	
	/**
	 * Verify that the cost method works correctly.
	 */
	public static void testItemCost() {
		System.out.println("-->testItemCost"); 
		System.out.println("Expected= $4.5");
		item p = buildItem1();
		System.out.println("Actual=   $" + p.getCost());
		
		 
	}

	/**
	 * Verify that the toString method produces a string exactly
	 * as specified in the assignment document. 
	 */
	public static void testToString() {
		System.out.println("-->testToString"); 
		System.out.println("Expected: Name=Crackers, cost=$4.50, weight=2.25");
		item p = buildItem1();
		System.out.println("Actual:   " + p.toString());
	}
	
	public static void testEquals1() {
		item p1 = new item("Gummy bears", 0.20);
		item p2 = new item("rock candy", 1.20);
		System.out.println("-->testEquals1"); 

		System.out.println(p1.equals(p2));  // false
	}
	public static void testEquals2() {
		item p3 = new item("Gummy bears", 0.20);
		item p1 = new item("Gummy bears", 0.20);
		System.out.println("-->testEquals2"); 

		System.out.println(p1.equals(p3));  // true
	}
	//helper method
	private static item buildItem1() {
		item p;
		p  = new item("Crackers", 2.25);
		
		return p;
	}
}