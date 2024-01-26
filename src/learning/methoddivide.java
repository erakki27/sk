package learning;

import java.util.Scanner;

public class methoddivide {
	
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("result is " +divide(a,b));
	}
	
	public static double divide(int a, int b) {
		double result = 0;
		if(b==0) {
			System.out.println("Divide by 0 not allowed");
			
		}else {
			result =a/b;
		}
		return result;
		
	}
}
