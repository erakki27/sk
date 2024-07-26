package learning;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s ="luffy is still joyboy";
		lengthoflast(s);

	}
	
	static int lengthoflast(String s) {
		
		String words[] = s.split("[, ]+");
		int l = words[words.length-1].length();
		
		System.out.println(l);
		
		return l;
	}

}
