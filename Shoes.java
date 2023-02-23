public class Shoes {
	String ShoesType;
	String  ShoesBrand;
	int Quantity;
	String ShoesColor;
	int price;

	public static void main(String[] args) {
		Shoes Man=new Shoes();
		Man.ShoesType="Sports";
		Man.ShoesBrand="Nike";
		Man.Quantity=1;
		Man.ShoesColor="blue";
		Man.price=2000;
		System.out.println("Shoes type:  "+Man.ShoesType);
		System.out.println("Shoes Brand:  "+Man.ShoesBrand);
		System.out.println("Shoes  Color:  "+Man.ShoesColor);
		System.out.println("Shoes Qantity:  "+Man.Quantity);
		System.out.println("Shoes  price:  "+Man.price);
			
	}

}
