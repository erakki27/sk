package learning;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class consecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter string to Check");

		Scanner sc= new Scanner(System.in);
		
		String str1 = sc.nextLine();
		
		String str = str1.toLowerCase();
consecutivec(str);
	}
	
	public static void consecutivec(String str) {
		String result = Arrays.stream(str.split("(?<=(.))(?!\\1)"))
		        .map(s -> (s.length() > 1 ? s.length() : "")+ Character.toString(s.charAt(0)))
		        .collect(Collectors.joining());
		String result1 = Pattern.compile("(.)\\1*").matcher(str) .replaceAll(mr -> mr.end() - mr.start() + mr.group(1));
		System.out.println(result1);
		
		
	}

}
	
