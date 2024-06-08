package learning;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		System.out.println("Enter String to Check");

		Scanner sc= new Scanner(System.in);
		String str1 =sc.nextLine();
		System.out.println(brackets(str1));

	}
	
	static boolean brackets(String str1) {
		
		Stack<Character> st = new Stack<>();
		
		for(char c : str1.toCharArray()) {
			if(c=='(')
				st.push(')');
			else if (c=='{')
				st.push('}');
			else if(c=='[')
				st.push(']');
				
				else if(st.isEmpty() || st.pop() != c)
					return false;
			
		}
		
		return st.isEmpty();
		
	}

}
