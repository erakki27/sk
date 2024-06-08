package learning;

public class individualWordOfArray {

	public static void main(String[] args) {
		String str = "the is of of are is of";
		array(str);

	}
	
	static void array(String str) {
		
		String[] arr = null;
		
		arr = str.split(" ");
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
	}

}
