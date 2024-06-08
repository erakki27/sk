package learning;

public class FindMaxandMinLengthInStringOfword {

	public static void main(String[] args) {
		
		String str = "hi i am akanksha, and how anreyourakanksh";
		maxstring(str);

	}
	
	static void maxstring(String str) {
		
		String[] words = str.split("[, ]+");
		String maxword = "";
		String minword ="";
		
		for(int i=0;i<words.length;i++) {
			if(words[i].length()<minword.length() || minword.isEmpty()) {
				minword = words[i];
				
			}
			if(words[i].length()>maxword.length()) {
				maxword = words[i];		
			}
			
		}
		
		System.out.println("The max word is " +maxword + " and its length is " + maxword.length());
		System.out.println("The min word is " +minword + " and its length is " + minword.length());
		
	}

}
