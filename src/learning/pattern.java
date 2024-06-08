package learning;

public class pattern {

	public static void main(String[] args) {
		pyramid(6);
		triganleLeft(6);
		triganright(6);
		
	}		
		
	static void pyramid(int row) {
		int i,j;
		//outer loop for row
		
		for(i=0;i<row;i++) {
			
			// loop for space
			for(j=row-i;j>1;j--) {
				System.out.print(" ");
			}
			
			//forcolumn
			
			for(j=0;j<=i;j++) {
				System.out.print("A ");
				
			}
			System.out.println();
			
		}

	}
	
	static void triganleLeft(int row) {
		int i,j;
		//outer loop for row
		
		for(i=0;i<row;i++) {
			//forcolumn
			
			for(j=0;j<=i;j++) {
				System.out.print("A ");
				
			}
			System.out.println();
			
		}

	}
	
	static void triganright(int row) {
		int i,j;
		//outer loop for row
		
		for(i=row;i>=0;i--) {
			//forcolumn
			
			for(j=0;j<=i;j++) {
				System.out.print("A ");
				
			}
			System.out.println();
			
		}

	}

}
