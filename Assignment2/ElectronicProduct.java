public class ElectronicProduct extends Product{
	
private String powerSource;
 private boolean energyEfficient;
 private boolean smartHomeCompactible;
 
  public ElectronicProduct(String name, String brand, double price, String type, boolean eco_friendly,String powerSource,boolean energyEfficient,boolean smartHomeCompactible) {
		super(name, brand, price, type, eco_friendly);
		this.powerSource=powerSource;
		this.energyEfficient=energyEfficient;
		this.smartHomeCompactible=smartHomeCompactible;
	}
 
public String getPowerSource() {
	return powerSource;
}
public void setPowerSource(String powerSource) {
	this.powerSource = powerSource;
}
public boolean isEnergyEfficient() {
	return energyEfficient;
}
public void setEnergyEfficient(boolean energyEfficient) {
	this.energyEfficient = energyEfficient;
}
public boolean isSmartHomeCompactible() {
	return smartHomeCompactible;
}
public void setSmartHomeCompactible(boolean smartHomeCompactible) {
	this.smartHomeCompactible = smartHomeCompactible;
}
 public void print_Info() {
	 super.print_Info();
	 System.out.println("product name: "+name);
	 System.out.println("product Brand: "+brand);
	 System.out.println("product Price: "+price);
	 System.out.println("product Type: "+type);
	 System.out.println("product Eco-Friendly: "+eco_friendly);
 }
}
