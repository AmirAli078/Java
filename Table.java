public class Table {
	public void getNum(int num) {
		System.out.println("enter the number for table: "+num);
		for(int i=1; i<=10; i++) {
			System.out.println(num+" "+"* "+i+" = "+num*i);
		}
	}

	public static void main(String[] args) {
		Table Obj=new Table();
		Obj.getNum(5);

	}

}