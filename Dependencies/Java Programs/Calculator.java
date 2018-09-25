import java.util.Scanner;
public class Calculator{
	public int max(int[] a){
		int max = a[0];
		for(int i = 1 ; i < a.length ; i++){
			if(a[i] > max){
				max = a[i];	
			}
		}
		return max;
	}
	public int min(int[] a){
		int min= a[0];
		for(int i = 1 ; i < a.length ; i++){
			if(a[i] < min){
				min= a[i];	
			}
		}
		return min;
	}
	public int sum(int[] a){
		int sum = 0;
		for(int i : a){
			sum = sum + i;
		}
		return sum;
	}	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size ; i++){
		  arr[i] = sc.nextInt();
		}
		Calculator c = new Calculator();
		int max = c.max(arr);
		System.out.println("Largest Number is: "+max);
		int min = c.min(arr);
		System.out.println("Smallest Number is: "+min);
		int sum = c.sum(arr);
		System.out.println("Sum of elements are: "+sum);		
	}
}