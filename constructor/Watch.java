public class Watch {
		int model;
		String watchBrand;
		int quantity;
		String watchColor;
		int price;
		public Watch(int model,String watchBrand,int quantity,String watchColor, int price ) {
		this. model=model;
		this. watchBrand=watchBrand;
		this. quantity=quantity;
		this. watchColor=watchColor;
		this. price=price;
	}

public static void main(String[] args) {
		Watch Rado=new Watch(2022,"Rado",1, "Gold",300000);
		System.out.println("Watch Model:  "+Rado.model);
		System.out.println("brand Watch:  "+Rado.watchBrand);
		System.out.println("Watch Color:  "+Rado.watchColor);
		System.out.println("Watch Qantity:  "+Rado.quantity);
		System.out.println("watch price:  "+Rado.price);
			

	}

}