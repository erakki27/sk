package learning;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringNonrepeated {

	public static void main(String[] args) {
		
		System.out.println("Enter String to Check");

		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(substringNonrepeat(s));
		

	}
	
	static int substringNonrepeat(String s) {
		int maxlen=0;
		int left=0,right=0;
		
		Set<Character> charset = new HashSet<>();
		
		for(right=0; right<s.length();right++) {
			if(!charset.contains(s.charAt(right))) {
				charset.add(s.charAt(right));
				maxlen= Math.max(maxlen, right-left+1);
			}else {
				while(charset.contains(s.charAt(right))) {
					charset.remove(s.charAt(left));
					left++;
					
				}
				charset.add(s.charAt(right));
			}
		}
		return maxlen;
		
	}

}
