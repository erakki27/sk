package learning;

import java.util.Scanner;

public class covertCharInstringToOppsiteCase {
	public static void main(String[] args) {
	System.out.println("Enter string to Check");
	Scanner sc =  new Scanner(System.in);
	String str = sc.nextLine();
	System.out.println("string in opposite string is  " + oppositeCase(str) );

	}	
	static String oppositeCase(String str) {
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<str.length();i++) {
		char c = str.charAt(i);
		if(c>='A' && c <='Z') {
			sb.append((char)(c+32));
			
		}else if(c>='a' && c <='z') {
			sb.append((char)(c-32));
		}else {
			sb.append(c);
		}
		}
		String str1 = sb.toString();
		return str1;
		
	}

}
