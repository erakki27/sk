package learning;

public class SwapFirstandLastCharInwords {

	public static void main(String[] args) {
		
		String str ="love amazon";
		System.out.println(swap(str));
		

	}

	
	static String swap(String str) {
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int k =i;
			
			while(i<ch.length && ch[i] != ' ')
				i++;
			
			//swap
			char temp = ch[k];
			ch[k] =ch[i-1];
			ch[i-1] = temp;
		 
			
		}
		return new String(ch);
		
	}
}
