package learning;

import java.util.Scanner;

public class commanCharCount {

	public static void main(String[] args) {
		System.out.println("Enter Strings");
		
		Scanner sc= new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(solution(s1, s2));
	}
	
	 static int solution(String s1, String s2) {

		int count =0;

		boolean[]  t = new boolean[s2.length()];
		
		System.out.println(t);

		 for(int i=0;i<s1.length();i++){
		     for(int j=0;j<s2.length();j++){
		         if(s1.charAt(i)==s2.charAt(j) && !t[j]){
		             t[j] = true;
		             count++;
		         break;
		     }
		     }
		 }
		 return count;
		}

}
