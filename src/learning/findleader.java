package learning;

public class findleader {
	
	public static void main(String[] args) {
		int  a[] = {16, 17, 4, 3, 5, 2};  //1, 2, 3, 4, 5, 2
		
		leader(a);
	}

	
	//find leader,leader element is one who is greater than all element in right
	
	static void leader(int a[]) {
		
		int leader = a[a.length-1]; //last element is leader suppose
		System.out.println(leader);
		
		for(int i=a.length-1;i>=0;i--) {
			if(leader<a[i]) {
				leader = a[i];
				System.out.println(leader);
			}
			
		}
		
	}
	
}
