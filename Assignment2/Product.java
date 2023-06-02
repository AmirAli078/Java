public class Product {
	private String name;
	private String brand;
	private double price;
	private String type;
	private boolean eco_friendly;
	public Product(String name,String brand,double price,String type,boolean eco_friendly) {
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.type=type;
		this.eco_friendly=eco_friendly;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean getEco_friendly() {
		return eco_friendly;
	}
	public void setEco_friendly(boolean eco_friendly) {
		this.eco_friendly = eco_friendly;
	}
	public String toString() {
		return(name+" "+brand+" "+price+" "+type+" "+eco_friendly);
	}
	public void print_Info() {
		System.out.println("Product name: "+name);
		System.out.println("Product brand: "+brand);
		System.out.println("Product price: "+price);
		System.out.println("Product type: "+type);
		System.out.println("Eco-Friendly Product: "+eco_friendly);
	}
}
