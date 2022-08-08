package prob1;

public class RefrigeratedItem extends item{

	
	private double temperature;

	public RefrigeratedItem(String name, double weight, double temp) {
		super(name, weight);
		this.temperature = temp;
	}
	
	public double getTemp() {
		return temperature;
	}
	public RefrigeratedItem(item item, double temperature) {
		super(item.getItemName(), item.getWeight());
		this.temperature = temperature;
	}
	@Override
	public double getCost() {
		double cost = ((weight * 2.0) + (100.0 - temperature ) * 0.1);
		return cost;
	}
	@Override
	public String toString() {
	String msg = String.format("Name=%s, cost=$%.2f, weight=%.2f, temp=%.2f degrees",getItemName(), getCost(), getWeight(), getTemp());
	return msg;
	
}
	
}