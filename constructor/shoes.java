public class shoes {
	String shoesType;
	String  shoesBrand;
	int quantity;
	String shoesColor;
	int price;
public shoes(String shoesType,String shoesBrand,int quantity,String shoesColor, int price ) {
		this. shoesType=shoesType;
		this. shoesBrand=shoesBrand;
		this. quantity=quantity;
		this. shoesColor=shoesColor;
		this. price=price;
	}
	public static void main(String[] args) {
		shoes Man=new shoes("Sports","Nike",1,"blue",2000);
		System.out.println("Shoes type:  "+Man.shoesType);
		System.out.println("Shoes Brand:  "+Man.shoesBrand);
		System.out.println("Shoes  Color:  "+Man.shoesColor);
		System.out.println("Shoes Qantity:  "+Man.quantity);
		System.out.println("Shoes  price:  "+Man.price);
			
	}

}
