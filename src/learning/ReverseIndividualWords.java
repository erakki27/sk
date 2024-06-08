package learning;

import java.util.Stack;

public class ReverseIndividualWords {

	public static void main(String[] args) {
		
      String str ="Hello Java";
      revword(str);
	}
     
	static void revword(String str) {
		
		Stack<Character> stk = new Stack<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				stk.push(str.charAt(i));}
			else {
				while(stk.empty()==false) {
					System.out.print(stk.pop());
				}
				System.out.print(" ");
					
			}
			
		}
		while (stk.empty() == false) {
            System.out.print(stk.pop());
		}
	}
}
