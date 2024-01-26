package learning;

import java.util.Scanner;

public class sumtwopositivenumber {

	public static void main(String[] args) {
		System.out.println("Enter Numbers to Check");
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			 int b = sc.nextInt();
			 
			 exception(a,b);
		}

	}
	
	/*static void sumpositive(int a, int b) {
		if(a>=0 && b>=0) {
			int c;
			
			c=a+b;
			System.out.println("Sum of numbers " + c);
					
		} else   {
			System.out.println("not positive");


		}	
		
	}*/
	
	static void exception(int a, int b) {
		try {
			if(a>=0 && b>=0) 
			{
		 int c;
			c=a+b;
			System.out.println("Sum of numbers " + c);
			}
			else
			{
				throw new negetivenumberimput("only positive number allowed for sum");
			}
	  }catch(negetivenumberimput e)   {
		  System.out.println(e);

			}	
	}
}
