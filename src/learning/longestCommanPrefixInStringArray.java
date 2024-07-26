package learning;

import java.util.Arrays;

public class longestCommanPrefixInStringArray {

	public static void main(String[] args) {
		String[] str = {"dog","racecar","car"};
		
		System.out.println(longestprefix(str));

	}
	
	
	static String longestprefix(String[] str) {
		Arrays.sort(str);
		String s1 = str[0];
		String s2 = str[str.length-1];
		int id =0;
		
		while(id<s1.length()&&id<s2.length()) {
			if(s1.charAt(id)==s2.charAt(id)) {
				id++;
				
			}else {
				break;
			}
			
		}	
		return s1.substring(0,id);
		
	}

}
