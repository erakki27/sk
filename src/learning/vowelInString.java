package learning;

import java.util.Scanner;

public class vowelInString {
public static void main(String[] args) {
		
		System.out.println("Enter string to Check");

		Scanner sc= new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		String str = str1.toLowerCase();
		
		System.out.println("number of vowel in string " +vowel(str));
	}

     static int vowel(String str) {
    	  int count = 0;
    	  
    	  for(int i=0;i<str.length();i++) {
    		  
    		  if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
    			  
    			  count++;
    		  }
    		 
    	  }
    	 
		return count;
    	 
    	 
     }

}
