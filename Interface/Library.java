interface Library{
	void getBook();
	void submitBook();
}
class Student implements Library{
	public void getBook(){
	System.out.println("what kind of book you want: ");	
	}
	public void submitBook(){
	System.out.println("your book is submitted sir!");
	}
}
class Teacher implements Library{
	public void getBook(){
	System.out.println("what kind of you want: ");
	}
	public void submitBook(){
	System.out.println("your book is submitted!");
	}
	public static void main(String args[]){
		Teacher t=new Teacher();
		t.getBook();
		t.submitBook();
		Student s=new Student();
		s.getBook();
		s.submitBook();
	}
}
