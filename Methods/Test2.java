public class Test2{
	static void getSum(int[] num){
		int c=0;
		for(int i=0; i<num.length; i++){
			c+=num[i];
		}
		System.out.println(c);
	}
	public static void main(String args[]){
		int [] num={10,20,30,40};
		getSum(num);
		
	}
	}