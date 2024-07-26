package learning;

public class FirstIndexOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="sadtubsad";
		String findstr ="tut";
		System.out.println(indexOfstring(str,findstr));
		
		

	}
	
	static int indexOfstring(String str, String findstr) {
		
		if(str.contains(findstr)) {
			return str.indexOf(findstr);
			
		}
		return -1;
		
	}

}
