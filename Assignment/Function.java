class Function{
 public int sum(int [] array ){
   int sum=0;
   for(int i=0; i<array.length; i++){
	   sum=sum+array[i];
   }
   return sum;
 }
 public int sum(int [] array, char ch){
	  int sum = 0;
    if (ch == 'E') {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
    } else if (ch == 'O') {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                sum += array[i];
            }
        }
    }
    return sum;
 }
 
   public static void main(String args[]){
	   Function f=new Function();
	   int[] array={1,2,3,4,5};
	   System.out.println(f.sum(array,'O'));
   }
}