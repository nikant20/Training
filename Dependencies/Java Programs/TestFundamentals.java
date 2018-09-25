public class TestFundamentals{
	public static void main(String[] args){
		//create array of int type having 5 elements
		int[] arr = {20,15,25,35,30};
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i]%2==0){
				System.out.println("at "+i+" = "+arr[i]);	
			}
		}
		// Enhanced for loop
		for(int i : arr){
			//don't use arr[i]
			if(i % 2 == 1)
			System.out.println("i = "+i); //Here i isn't a index. It is an iterator which will take value from array
		}
	}
}