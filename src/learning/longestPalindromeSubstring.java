package learning;

import java.util.Scanner;

public class longestPalindromeSubstring {
	public static void main(String[] args) {
		
		System.out.println("Enter String to Check");

		Scanner sc= new Scanner(System.in);
		String str =sc.nextLine();
		System.out.println(longestPalindrome(str));
	}

	
  static String longestPalindrome(String str) {
	  
	  if(str.length()<=1){
          return str;
      }
	  
	  String maxlenstr= str.substring(0,1);
	  
	  for(int i=0; i<str.length()-1;i++) {
		  String odd = center(str,i,i);
		  String even = center(str,i,i+1);
		  
		  if(odd.length()>maxlenstr.length()) {
			  
			  maxlenstr=odd;
		  } if(even.length()>maxlenstr.length()) {
			  
			  maxlenstr= even;
		  } 
		   
	  }
	  
	return maxlenstr;
	  
  }
  
  static String center(String str, int left, int right) {
	  while(left>=0 && right<str.length() && str.charAt(left)== str.charAt(right)) {
		  left--;
	  right++;
	  }
	return str.substring(left +1 ,right);
	  
  } 
}