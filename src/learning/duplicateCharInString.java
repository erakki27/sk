package learning;

import java.util.Scanner;

public class duplicateCharInString {

	public static void main(String[] args) {
		System.out.println("Enter string to Check");

		Scanner sc= new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		String str = str1.toLowerCase();
		if(dupChar(str)) {
		System.out.println(str + " has duplicates in string " );
		}else {
			System.out.println(str + " not has duplicates in string " );
		}
	}
	
	static boolean dupChar(String str) {
		 
		for(int i=0 ; i<str.length();i++) 
			for(int j=i+1; j<str.length();j++) 
				if(str.charAt(i)==str.charAt(j)) 
		return true;
		return false;

	}
}
