//multilevel inheritance
public class Honda extends Car{
		public static void main(String[] args){
		Honda h=new Honda();
		h.type="Civic";
		h.name="Civic R type";
		h.color="white";
		h.price=5000000;
		System.out.println(h.type);
		System.out.println(h.name);
		System.out.println(h.color);
		System.out.println(h.price);
		}
		}