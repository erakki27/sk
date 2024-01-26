package learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countduplicateinstring {

	public static void main(String[] args) {
		System.out.println("Enter string to Check");

		Scanner sc= new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		String str = str1.toLowerCase();
		countofduplicate(str);

	}
static void countofduplicate(String str) {
	Map <Character, Integer> HM = new HashMap<Character, Integer>();
	
	char[] charArray = str.toCharArray();
	
	for(char c : charArray) {
		if(HM.containsKey(c)) {
			HM.put(c, HM.get(c)+1);
			
		}else {
			HM.put(c, 1);
		}
		
	}
	for(Map.Entry<Character, Integer> entry : HM.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey() +" : " +entry.getValue());
			
		}
		
	}
	
}
}
