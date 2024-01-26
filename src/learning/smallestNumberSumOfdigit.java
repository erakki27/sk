package learning;

import java.util.Scanner;

public class smallestNumberSumOfdigit {

	public static void main(String[] args) {
		System.out.println("Enter input Number ");
		try (Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			smallestNum(n);
			
		}
	}	

	static void smallestNum(int n) {
		int smallestNum = (int) ((n%9+1)*Math.pow(10, (n/9))-1);
		
		System.out.println(smallestNum);
		
	}

}
