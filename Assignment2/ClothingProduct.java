public class ClothingProduct extends Product {
	private String size;
	 private String material;
	 private String color;
	 private String style;
	 
 public ClothingProduct(String name, String brand, double price, String type, boolean eco_friendly, String size,String material,String color,String color) {
		super(name, brand, price, type, eco_friendly);
		this.size=size;
		this.material=material;
		this.color=color;
		this.style=style;
	}

public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getStyle() {
	return style;
}
public void setStyle(String style) {
	this.style = style;
}
public void print_Info() {
	super.print_Info();
	System.out.println("Cloth size: "+size);
	System.out.println("Cloth material: "+material);
	System.out.println("Cloth color: "+color);
	System.out.println("Cloth style: "+style);
}
}