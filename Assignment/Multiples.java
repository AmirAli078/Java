import java.util.Scanner;
class Multiples{
    public void table(int num){
		for (int i=1; i<=10; i++){
			int table=num*i;
			System.out.print(table+" ");
		}
		System.out.println();
			for(int j=11; j<=20; j++){
			int table=num*j;
		System.out.print(table+" ");
		}
	    System.out.println();
	}

  public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  Multiples obj=new Multiples();
	  int num;
	  System.out.println("Enter the number:  ");
	  num=sc.nextInt();
	  obj.table(num);
  }
}