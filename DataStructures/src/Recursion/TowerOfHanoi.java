package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	
	static void towerOfHanoi(int n, char source_disc, char destination_disc, char auxillary_disc) {
		if(n==1) {
			System.out.println("Moving disc 1 from rod "+source_disc+" to rod "+destination_disc);
			return;
		}
		towerOfHanoi(n-1, source_disc, auxillary_disc, destination_disc);
		System.out.println("Move disk " + n + " from rod " +  source_disc + " to rod " + destination_disc);
		towerOfHanoi(n-1, auxillary_disc, destination_disc, source_disc);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of disc: ");
		int n = sc.nextInt();
		towerOfHanoi(n, 'A', 'C','B');

	}

}
