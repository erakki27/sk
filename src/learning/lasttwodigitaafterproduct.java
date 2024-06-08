package learning;

import java.util.Scanner;

public class lasttwodigitaafterproduct {

	public static void main(String[] args) {
		System.out.println("Enter M to Check");

		Scanner sc= new Scanner(System.in);
		
		int arr[] = {12,13,14};
		
		int M = sc.nextInt();
		lastdigit(arr,M);

	}
	
	static void lastdigit(int arr[] , int M) {
		
		for(int i=0;i<arr.length;i++) {
			int pro = 0;
			int last =0;
			pro= arr[i]*M;
			System.out.println(pro);
			last = pro %100;
			System.out.println(last);
			
		}
		
		
		
	}

}
