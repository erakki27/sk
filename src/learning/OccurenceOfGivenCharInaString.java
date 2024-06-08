package learning;

public class OccurenceOfGivenCharInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Akanksha";
		str = str.toLowerCase();
		 char c = 'a';
		 System.out.println("Count of given char " +c+ " : "+countoccurance(str,c));
		 removegivenchar(str,c);
		 
		
}
	
	static int countoccurance(String str, char c) {
		
		int occ = 0;
		
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)== c) 
				occ++;
		}
		return occ;
		
	}
	
	static void removegivenchar(String str, char c) {
		
		str = str.replace(Character.toString(c), "");
		System.out.print(str);
		
	}
}
