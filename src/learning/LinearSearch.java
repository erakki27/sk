package learning;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[] = {15,20,18,16};
		int c = 19;
		
		String str ="akanksha";
		
		char t ='t';
		System.out.println(linearstring(str,t));
		
		
		
		/*
		 * System.out.println("Check if elemnt exits is array " +linear(a,c));
		 * System.out.println("Check element index " +linearindex(a,c));
		 */

	}
   
	static boolean linear(int[] a, int c) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==c) {
				
			return true;
			}	
		}
		return false;
		
	}
	
	static int linearindex(int[] a, int c) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==c) {
				return i;
			}
			
		}
		return -1;
		
	}
	
	static boolean linearstring(String str, char t) {
		
		
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==t) {
				return true;
			}
			
		}
		return false;
		
	}

}
