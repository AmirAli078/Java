public class Furniture {
	String	furnitureKind;
	String  furnitureSize;
	int quantity;
	String color;
	public Furniture(String furnitureKind,String furnitureSize,int quantity,String color) {
		this. furnitureKind=furnitureKind;
		this. furnitureSize=furnitureSize;
		this.quantity=quantity;
		this. color=color;
	}
	public static void main(String[] args) {
		Furniture Sofa=new Furniture("Simple Sofa","Medium", 6,"blue");
		System.out.println(Sofa.furnitureKind);
		System.out.println(Sofa.furnitureSize);
		System.out.println(Sofa.quantity);
		System.out.println(Sofa.color);

	}

}