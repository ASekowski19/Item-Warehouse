package prob1;

public class item {

	protected String name;
	protected double weight;

	public item(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	public item(String name) {
        this.name = name;
        this.weight = 0;
    }
	@Override
	public boolean equals(Object o) {
		if(o instanceof item) {
			item p = (item)o;
			return this.name == p.name;
		}
		return false;
	}

	
	public String getItemName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public double getCost() {
		double cost = weight * 2.0;
		return cost;
	}
	
	@Override
	public String toString() {
	String msg = String.format("Name=%s, cost=$%.2f, weight=%.2f",getItemName(), getCost(), getWeight());
	return msg;
   }
}