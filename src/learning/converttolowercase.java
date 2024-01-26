package learning;

public class converttolowercase {
	

	public static void main(String[] args) {
		
		String str = "aKANKSHA";
		StringBuilder sb = new StringBuilder(str);
		
		for(int i=0;i<sb.length();i++) {
			
			if(Character.isUpperCase(sb.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
				
			}else {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
			}
			
		}
		str = sb.toString();
		System.out.println(str);
		
	
	
	}
}
