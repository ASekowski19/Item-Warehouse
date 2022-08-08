package prob1;

public class RefrigeratedItemTest {

	public static void main(String[] args) {
		testConstructorMain();
		testConstructorAcceptsItem();
		testItemCost();
		testToString();
		testEquals1();
		testEquals2();
	}
	
	/**
	 * Verify that the name, weight, & temp are initialized with the main constructor.
	 */
	public static void testConstructorMain() {
		System.out.println("-->testConstructorMain");  
		System.out.println("Expected: Name=Ice Cream, cost=$10.00, weight=1.00, temp=20.00 degrees");
		RefrigeratedItem a= buildRefrigeratedItem1();
		System.out.println("Actual:   " + a); 
	}
	

	/**
	 * Verify that the name, weight, & temp are initialized with the second constructor.
	 */
	public static void testConstructorAcceptsItem() {
		System.out.println("-->testConstructorAcceptsItem"); 
		System.out.println("Expected: Name=Ice Cream, cost=$10.00, weight=1.00, temp=20.00 degrees");
		item b = buildItem1();
		RefrigeratedItem a = new RefrigeratedItem(b, 10.00);
		System.out.println("Actual:   "+ a); 
	}

	/**
	 * Verify that the cost method works correctly.
	 */
	public static void testItemCost() { 
		System.out.println("-->testItemCost"); 
		System.out.println("Expected: $10.0");
		item a = buildRefrigeratedItem1();
		System.out.println("Actual:   $" + a.getCost()); 
	}

	/**
	 * Verify that the toString method produces a string exactly
	 * as specified in the assignment document. 
	 */
	public static void testToString() {
		System.out.println("-->testToString"); 
		System.out.println("Expected: Name=Ice Cream, cost=$10.00, weight=1.00, temp=20.00 degrees");
		item a = buildRefrigeratedItem1();
		System.out.println("Actual:   " + a.toString());
	} 
	private static RefrigeratedItem buildRefrigeratedItem1() {
		RefrigeratedItem a;
		a  = new RefrigeratedItem("Ice cream", 1.00, 20.00);
		return a;
	}
	private static item buildItem1() {
		item b;
		b = new item("Ice Cream", 2.00);
		return b;
	}
	public static void testEquals1() {
		item p1 = new item("Ice Cream", 1.50);
		item p2 = new item("Pizza", 2.10);
		System.out.println("-->testEquals1"); 

		System.out.println(p1.equals(p2));  // false
	}
	public static void testEquals2() {
		item p3 = new item("Ice Cream", 1.50);
		item p1 = new item("Ice Cream", 1.50);
		System.out.println("-->testEquals2"); 
		System.out.println(p1.equals(p3));  // true
	}

}