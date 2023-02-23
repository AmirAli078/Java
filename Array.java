public class Array{
	public static void main(String args[]){
	int arr1 []={1,2,3,4,5};
	int target =11;
	int sum=0;
	for(int i=0; i<arr1.length; i++){
		for (int j=1; j<arr1.length; j++){
			for (int k=2; k<arr1.length; k++){
				sum=arr1[i]+arr1[j]+arr1[k];
				if(sum==target){
					System.out.println(arr1[i]+" "+arr1[j]+" "+arr1[k]);
					System.out.println(sum);
				}
			}
		}
	}
	}
	}