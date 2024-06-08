package learning;

public class SwapFirstandLastCharinString {

	public static void main(String[] args) {
		String s= "singh";
		
		char[] c = s.toCharArray();  //{l,o,v,e}
		
		int i=0;
		int j = c.length-1;
		
		char temp;
		
		temp = c[i];
		c[i]= c[j];
		c[j] = temp;
		
		System.out.println(new String(c));

	}

}
