package learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class duplicateWordInString {
	public static void main(String[] args) {
		System.out.println("Enter string to Check");

		Scanner sc= new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		String str = str1.toLowerCase();
		countduplicatewords(str);

	}
	
	static void countduplicatewords(String str) {
		
		String[] words = str.split("\\W");
		
		Map<String, Integer> word_map = new HashMap<String, Integer>();
		
		for(String word : words) {
			
			if(word_map.get(word) != null) {
				word_map.put(word, word_map.get(word)+1);
			}else {
				word_map.put(word, 1);
			}
			
		}
		
		for(Entry<String, Integer> entry : word_map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +" : " +entry.getValue());
				
			}
			
		}
	}
}
