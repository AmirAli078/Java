class Calendar{
	private int day;
	private int month;
	private int year;
	public Calendar(){
		day=5;
		month=2;
		year=23;
	}
	public void print(){
		System.out.println("date: "+day+"/"+month+"/"+year);
	}
	public static void main(String args[]){
		Calendar c=new Calendar();
		c.print();
	}
	}