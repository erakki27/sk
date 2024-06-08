package learning;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class addOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter string to Check");

		Scanner sc= new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		String str = str1.toLowerCase();
		countofduplicate(str);

	}
static void countofduplicate(String str) {
	Map <Character, Integer> HM = new LinkedHashMap<Character, Integer>();
	
	char[] charArray = str.toCharArray();
	
	for(char c : charArray) {
		if(HM.containsKey(c)) {
			HM.put(c, HM.get(c)+1);
			
		}else {
			HM.put(c, 1);
		}
		
	}
	for (char c : HM.keySet()) {
		System.out.println(c +" : " +HM.get(c));
		//System.out.print(HM.get(c));
		
	}
		
		

	}

}
