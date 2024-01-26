package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class largestithreenumbers {

	
	public static void main(String[] args) {
		
		System.out.println("Enter three numbers");
		
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int l ;
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(a);
		al.add(b);
		al.add(c);
		
		System.out.println(Collections.max(al) + " largest number");
		
		//l = largeInt(a,b,c);
		
		//System.out.println(l  + " largest num");
	}
	
	/*static int largeInt(int a, int b, int c) {
		
		
		if(a>b && a>c) {
			return a;
		}else if(b>a && b>c) {
			return b;
		}else
		
		return c;
		
	}*/
	

}
