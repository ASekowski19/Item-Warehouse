package prob1;

import java.util.ArrayList;

public class warehouse {
	ArrayList<item> Items = new ArrayList<>();
	 
	
	public warehouse(int numItems) {
	}
	
	public boolean addItem(item e) {
		if(Items.contains(e)) {
			return false;
		}
		else {
			Items.add(e);
			return true; 
		}
	}
	
	public item getItem(int i) {
		if (i < Items.size() && i > -1) {
			return Items.get(i);
		}
		return null;
	}
	
	public item getItem(String itemName) {
		item itemKey = new item(itemName);
		if (Items.contains(itemKey)){
			int pos = Items.indexOf(itemKey);
				return Items.get(pos);
			}
		return null;
	}
	
	public int getNumItems() {
		return Items.size();
	}
	
	public double getAverageTemp() {
		double totalTemp = 0;
		double averageTemp = 0;
		for(int i = 0; i < getNumItems(); i++) {
			if(Items.get(i) instanceof RefrigeratedItem) {
				totalTemp += ((RefrigeratedItem) Items.get(i)).getTemp();
			}
		}
		averageTemp = totalTemp / Items.size();
		return averageTemp;
	}
	
	public int getNumRefrigeratedItems(){
		int numRefrigeratedItems = 0;
		for (int i = 0; i< Items.size(); i++) {
			if(Items.get(i) instanceof RefrigeratedItem) {
				numRefrigeratedItems++;
			}
		}
		return numRefrigeratedItems;
}
	
	public RefrigeratedItem[] getRefrigeratedItem() {
		RefrigeratedItem[] refrigeratedItem = new RefrigeratedItem[getNumRefrigeratedItems()];
		int j = 0;
		for (int i = 0; i<Items.size(); i++) {
			if(Items.get(i) instanceof RefrigeratedItem) {
				refrigeratedItem[j] = (RefrigeratedItem) Items.get(i);
				j++;
				}
			}
		return refrigeratedItem;
		}
	
	public double getTotalCost() {
		double totalCost = 0;
		for (int i = 0; i< Items.size(); i++) {
			totalCost += Items.get(i).getCost();
		}
		return totalCost;
	}
	
	public double getTotalCostRefrigerated() {
	 double totalCostRefrigerated = 0;
		for (int i = 0; i<Items.size(); i++) {
			if(Items.get(i) instanceof RefrigeratedItem) {
				totalCostRefrigerated = (double) Items.get(i).getCost();	
			}
		}
		return totalCostRefrigerated;
	}
	
	public item removeItem(int i) {
		  if(i>=0 && i<Items.size()) {
              return Items.remove(i);
          }
          return null;
      }

	
	public ArrayList<item> getItemsWithName(ArrayList<item> partialName) {
        ArrayList<item> itemMatches = new ArrayList<>();
        for(int i = 0; i < Items.size(); i++) {
            if (Items.get(i).toString().substring(0, 5).equals(partialName)) {
                itemMatches.add(Items.get(i));
            }
        }
    return itemMatches;
}
	public boolean hasItem(String findName) {
		item itemKey = new item(findName);
		if(Items.contains(itemKey)) {
			return true;
		}	
		else {
		return false;
	 }
}

	@Override
	public String toString() {
		String msg = "";
			for(int i = 0; i < Items.size(); i++ ) {
				msg += Items.get(i).toString() + "\n";
			}
			return msg;
	}

}