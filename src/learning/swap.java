package learning;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		System.out.println("Enter numbers ");
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			//swapnum(a,b);
			swapthird(a,b);
			
		}
	}		
		/*static void swapnum(int a, int b) {
			
			System.out.println("Before Swap " + a);
			System.out.println("Before Swap " + b);
			
			a=a-b;
			b =a+b;
			a=b-a;

            System.out.println("After Swap " + a);
            
			System.out.println("After Swap " + b);
			
		}*/
	
	static void swapthird(int a,int b) {
		
		System.out.println("Before Swap " + a);
		System.out.println("Before Swap " + b);
		
		int c = 0;
		c=a;
		a=b;
		b=c;

        System.out.println("After Swap " + a);
        
		System.out.println("After Swap " + b);
	}
	}


