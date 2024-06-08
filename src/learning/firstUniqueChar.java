package learning;

import java.util.HashMap;
import java.util.Map;

public class firstUniqueChar {

	public static void main(String[] args) {
		
		String s = "stress";
		
		int index = uniqueanotherway(s);
		System.out.println(index == -1
                ? "Either all characters are repeating or string "
                + "is empty"
          : "First non-repeating character is "
                + s.charAt(index) + " at index " +index);
		
	}
	
	static int unique(String s) {
		
		int index=-1;
		
		Map<Character,Integer> freqmap = new HashMap<>();
		
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			
			int freq = freqmap.getOrDefault(c, 0);
			
			freqmap.put(c, (freq+1));
			
		}
		
		for(int i=0; i<s.length();i++) {
			
			if(freqmap.get(s.charAt(i))==1) {
				index=i;
				break;
				
			}
		}
		return index;
		
	}
	
	static int uniqueanotherway(String s) {
		
		int[] freq = new int[26];
		for(int i=0; i<s.length();i++) 
			freq[s.charAt(i) - 'a']++;
			
		for(int i=0;i<s.length();i++)
			if(freq[s.charAt(i) - 'a']==1)
				return i;
		return -1;
		
	}
}
