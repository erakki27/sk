package learning;

import java.util.Scanner;

public class increement {
	
	public static void main(String[] args) {
		
		/*
		 * int y=0; for(int i=0;i<=6;i+=2) { //System.out.println(i); y+=i;
		 * System.out.println(y); } //System.out.println(y);
		 */
		System.out.println("Enter string to Check");
		System.out.println("Enter number to Check");
		

		Scanner sc= new Scanner(System.in);
		
		String status = sc.nextLine();
		int j = sc.nextInt();
		while(j <= 5) {
			if(status.contains("finall")) {
				System.out.println("status matched");
				break;
			}else
			System.out.println("searching continue till loop ends");
		}
		
	}
	

	
	
	

}
