package Coding_Ninjas;

import java.util.Scanner;

public class RotateKUnits {
    public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
			}

		int k = sc.nextInt();
		int units= k%n;
		int[] comp = new int[n];
		int idx =0;
		for(int i= units; i<n; i++){
			comp[idx++] = arr[i]; 
		}

		for(int i=0; i<units; i++){
			comp[idx++] = arr[i];
		}

		for(int i=0; i<n; i++){
			System.out.print(comp[i] + " ");
		}
		sc.close();
	}
}
