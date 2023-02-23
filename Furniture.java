public class Furniture {
	String	FurnitureKind;
	String  FurnitureSize;
	int Quantity;
	String Color;

	public static void main(String[] args) {
		Furniture Sofa=new Furniture();
	Sofa.FurnitureKind="Simple Sofa";
	Sofa.FurnitureSize="Medium";
	Sofa.Color="blue";
	Sofa.Quantity= 6;
	System.out.println("Furniture Kind:  "+Sofa.FurnitureKind);
	System.out.println("Furniture Size:  "+Sofa.FurnitureSize);
	System.out.println("Furniture Color:  "+Sofa.Color);
	System.out.println("Furniture Qantity:  "+Sofa.Quantity);
		

	}

}
