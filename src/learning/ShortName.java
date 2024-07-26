package learning;

public class ShortName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Devesh Kumar Singh";
		shortn(str);

	}
	
	static void shortn(String str) {
		String[] words = str.split(" ");
		for(String word : words) {
			System.out.print(Character.toUpperCase(word.charAt(0)) + ".");
			
		}
		
		
	}

}
