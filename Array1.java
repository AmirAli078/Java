public class Array1{
	public static void main(String args[]){
	int arr1 []={5,1,2,7,6};
	int highest=0;
		int Second=0;
		for(int i=0; i<arr1.length; i++) {
	     if (arr1[i]>highest) {
	    	 highest=arr1[i];
	    	 Second =highest;
	     }
	     else if(Second>arr1[i]) {
	    	 Second=arr1[i];
	    	 System.out.println(Second);
	     }
	    	 
	     }
		}
	}