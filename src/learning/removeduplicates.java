package learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class removeduplicates {

	public static void main(String[] args) {
		System.out.println("Enter string to Check");

		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		char[] c = str.toCharArray();
		System.out.println(removedup(c));
		System.out.println(duplicate(str));
	}
	
	static char[] removedup(char[] c) {
		
		String st ="";
		
		Map<Character, Integer> exits = new HashMap<>();
		
		for(int i=0;i<c.length;i++) {
			if(!exits.containsKey(c[i])) {
				st+=c[i];
				exits.put(c[i], 1);
			}
			
		}
		return st.toCharArray();
		
		
		
	}
	
	static String duplicate(String str) {
		String s ="";
		Map<Character,Integer> mp = new HashMap<>();
		
		char[] chararray = str.toCharArray();
		for(char c : chararray) {
			
			if(!mp.containsKey(c)) {
				s=s+c;
				mp.put(c, 1);
				
			}
			
		}
		return s;
		
	}
}
