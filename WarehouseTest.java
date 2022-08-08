package prob1;

import java.util.ArrayList;
import java.util.Arrays;

public class WarehouseTest {

	public static void main(String[] args) {
		testAddItem();
		testAddItem_Multiple();
		testGetItem_WithIndex();
		testGetItem_WithName();
		testGetAverageTemp();
		testGetRefrigeratedItems();
		testGetTotalCost();
		testGetTotalCostRefrigerated();
		testRemoveItem_WithIndex();
		testRemoveItem_WithName();
		testToString();
		testGetItemsWithName();
		testHasItem_true();
		testHasItem_false();

	}
	
	/**
	 * Add one item and check the number of items to verify.
	 */
	public static void testAddItem() {
		System.out.println("-->testAddItem"); 
		warehouse w = new warehouse(0);
        System.out.println("Num items before add:" + w.getNumItems()); 
        w.addItem(buildOneItem());
        System.out.println("Num items after  add: expected=1, actual=" + w.getNumItems()); 
    }
	
	
	/**
	 * Add three items and check the number of items to verify. At least one should be a refrigerated item.
	 */
	public static void testAddItem_Multiple() {
		System.out.println("-->testAddItem_Multiple"); 
		warehouse w = new warehouse(3);
		System.out.println("Num items before add:" + w.getNumItems()); 
		for(int i = 0; i < 3; i++) {
			item a = buildOneItem();
			w.addItem(a);
		}
		System.out.println("Num items after  add: expected=3, actual=" + w.getNumItems()); 
	}
	
	/**
	 * Add three items and retrieve the one at index 1.
	 */
	public static void testGetItem_WithIndex() {
		System.out.println("-->testGetItem_WithIndex"); 
		warehouse w = buildThreeItems();
		int loc=1;
		String expected = "grapes";
		item e=w.getItem(loc);
		String msg = "3 Items, getItem(" + loc + "): expected=" + expected +", actual=" + e.getItemName();
		System.out.println(msg);
	}

	/**
	 * Add three items and try to find one with a name that exists.
	 */
	public static void testGetItem_WithName() {
		System.out.println("-->testGetItem_WithName"); 
		warehouse w = buildFiveItems();
				
		String searchFor = "Cake";
		String expectedItemName = "null";
		item a = w.getItem(searchFor);

		String actualItemName = a==null ? "null" : a.getItemName();
		String msg = String.format("getItem(%s): expected=%s, actual=%s", searchFor, expectedItemName, actualItemName);
		System.out.println(msg);
	}

	/**
	 * Add 5 items, 3 of which are refrigerated. Verify the average temperature.
	 */
	public static void testGetAverageTemp() {
		System.out.println("-->testGetAverageTemp"); 
		warehouse w = buildFiveItems();
		String msg = "average temp, expected=24.0 degrees" + ", actual=" + w.getAverageTemp() + " degrees";
		System.out.println(msg);
	}
	
	/**
	 * Add 5 items, 3 of which are refrigerated. Verify that the 3 are returned in array.
	 */
	public static void testGetRefrigeratedItems() {
		System.out.println("-->testGetRefrigeratedItems");  
		warehouse w = buildFiveItems();
		String msg = "Expected: refrigerated items:  [Name=milk, cost=$10.00, weight=2.00, temp=40.00 degrees, Name=Whip Cream, cost=$8.00, weight=1.00, temp=40.00 degrees, Name=lemonade, cost=$8.00, weight=1.00, temp=40.00 degrees]\r\n"
				+ "Actual:   refrigerated items:  " + Arrays.toString(w.getRefrigeratedItem());
		System.out.println(msg); 
	}
	
	/**
	 * Add 5 items, 3 of which are refrigerated. Verify the total cost.
	 */
	public static void testGetTotalCost() {
		System.out.println("-->testGetTotalCost");  
		warehouse w = buildFiveItems();
		String msg = "total cost: expected=$28.5" +", actual=$" + w.getTotalCost();
		System.out.println(msg); 
	}
	
	/**
	 * Add 5 items, 3 of which are refrigerated. Verify the total cost of the 3 refrigerated items
	 */
	public static void testGetTotalCostRefrigerated() {
		System.out.println("-->testGetTotalCostRefrigerated"); 
		warehouse w = buildFiveItems();
		String msg = "total cost: expected=$8.0" +", actual=$" + w.getTotalCostRefrigerated();
		System.out.println(msg); 
	}

	/**
	 * Add 5 items, 3 of which are refrigerated. Remove the one at position 2 and 
	 * verify: the item is returned, and the number of items is decremented.
	 */
	public static void testRemoveItem_WithIndex() {
		System.out.println("-->testRemoveItem_WithIndex"); 
		warehouse w = buildFiveItems();
		item e=w.getItem(2);
		int loc = 0;
		int expectedNumItem = 4;
		String expectedItemName = "Cookies";
		e = w.removeItem(loc);
		String msg = String.format("5 items, after removeEmployee(%d):\n", loc);
		msg += String.format("num items: expected=%d, actual=%d\n", expectedNumItem, w.getNumItems());
		String actualEmpName = e==null ? "null" : e.getItemName();
		msg += String.format("item name: expected=%s, actual=%s", expectedItemName, actualEmpName);
		System.out.println(msg); 
	}

	/**
	 * Add 5 items, 3 of which are refrigerated. Remove one with a name that exists and 
	 * verify: the item is returned, and the number of items is decremented.
	 */
	public static void testRemoveItem_WithName() {
		System.out.println("-->testRemoveItem_WithName"); 
		warehouse w = buildFiveItems();
				
		String searchFor = "cake"
				+ "";
		String expectedItemName = "null";
		item a = w.getItem(searchFor);

		String actualItemName = a==null ? "null" : a.getItemName();
		String msg = String.format("getItem(%s): expected=%s, actual=%s", searchFor, expectedItemName, actualItemName);
		System.out.println(msg);
	}
	

	/**
	 * Verify that the toString method produces a string exactly
	 * as specified in the assignment document. 
	 */
	public static void testToString() {
		System.out.println("-->testToString"); 
		warehouse w = WarehouseTest.buildFiveItems();
			
		System.out.print(w.toString());
	}
	public static void testGetItemsWithName() {
	System.out.println("-->testGetItemsWithName");
	
	
	}
	public static void testHasItem_true() {
        System.out.println("-->testHasItem_true"); 
        warehouse w = buildFiveItems();
        System.out.println("Expected: true"); 
        System.out.println("Actual=" + w.hasItem("grapes")); 
    }

    public static void testHasItem_false() {
        System.out.println("-->testHasItem_false"); 
        warehouse w = buildFiveItems();
        System.out.println("Expected: false"); 
        System.out.println("Actual=" + w.hasItem("Dog Food")); 
    }


	
//Helper Methods



	public static item buildOneItem() {
		item a = new item("Tape", 0.5);
			return a;
	}
		
		public static warehouse buildThreeItems() {
			warehouse w = new warehouse(3);
				item a = new item("Cookies", 0.5);
			item b = new item("grapes", 0.75);
			RefrigeratedItem c = new RefrigeratedItem("milk", 2.00, 40.00);
			w.addItem(a);
			w.addItem(b);
			w.addItem(c);
			return w;
			}
	
	public static warehouse buildFiveItems() {
		warehouse w = buildThreeItems();
			RefrigeratedItem d = new RefrigeratedItem("Whip Cream", 1.00, 40.00);
			RefrigeratedItem e = new RefrigeratedItem("lemonade", 1.00, 40.00);
			w.addItem(d);
			w.addItem(e);
			return w;
			}
}

