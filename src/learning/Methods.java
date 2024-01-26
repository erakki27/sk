package learning;

import java.util.Scanner;

public class Methods {
	
	public void method1() {
		
		int a,b,c;
		
		
		System.out.println("Enter value of a and b");
		
		
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextInt();
			b = sc.nextInt();
		}
		c=a+b;
		
		
		System.out.println("Value of a " + a);
		System.out.println("Value of a " + b);
		System.out.println("Value of C " + c);
		
	}

}
