package learning;

import java.util.Scanner;

public class evenlengthStringFromStrig {

	public static void main(String[] args) {
		
		System.out.println("Enter String");
		
		Scanner sc = new  Scanner(System.in);
		String words = sc.nextLine();
		
		evenLenngthString(words);
		

	}
	
	static void evenLenngthString(String words) {
		
		for(String word : words.split(" ")) {
			
			if(word.length() % 2 !=0) {
				
				System.out.println(word);
				
			}
			
		}
		
		
		
	}

}
