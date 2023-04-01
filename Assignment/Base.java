class Base {
 public void method1(){
	 System.out.println("Method1 of base class ");
	 method2();
 }
 public void method2(){
	 System.out.println("Method2 of base class ");
 }
}
class Base2 extends Base{
	public void method2(){
		System.out.println("we are in Base2 class and  method2 is overrided");
	}
	public static void main(String args[]){
		Base2 b=new Base2();
		b.method2();
	}
}
	