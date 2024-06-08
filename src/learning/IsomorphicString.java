package learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicString {

	public static void main(String[] args) {
		System.out.println("Enter String 1 to Check");

		Scanner sc= new Scanner(System.in);
		String str1 =sc.nextLine();
		
		System.out.println("Enter String 2 to Check");
		String str2 =sc.nextLine();
		System.out.println(isomorphicString(str1, str2));

	}
	
	static boolean isomorphicString(String str1, String str2) {
		
		 if(str1.length() != str2.length()) {
			 return false;
			 
		 }
		 Map<Character,Character> mapping = new HashMap<>();
		 for(int i=0; i<str1.length();i++) {
		 char original = str1.charAt(i);
		 char replacement = str2.charAt(i);
		 
		 if(!mapping.containsKey(original)){
		   if(!mapping.containsValue(replacement))
		   mapping.put(original, replacement);
		   else
			   return false;
		 }  
		 else {
			 char mappingChar = mapping.get(original);
			 if(mappingChar != replacement)
				 return false;
		 }
			 }
		return true;
		
	}

}
