package learning;

import java.util.Scanner;

public class firstrepeatedchar {

	public static void main(String[] args) {
		
		System.out.println("Enter string ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			String str1 = str.toLowerCase();
			
			
			System.out.println("Repeated char is " +firstrepeatedcharr(str1));
		}

	}
      static char firstrepeatedcharr(String str1) {
    	  char c = ' ';
    	  for(int i=0;i<str1.length();i++) {
    		  for (int j=i+1;j<str1.length();j++) {
    			  
    			  if(str1.charAt(i)==str1.charAt(j)) {
    				  
    				  c = str1.charAt(j);
    			  }
    			  
    		  }
    		  
    	  }
		return c;
    	  
      }
}
