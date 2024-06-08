package learning;

import java.util.ArrayList;
import java.util.List;

public class matrixSpiral {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		List<Integer> op = spiral(matrix);
		
		System.out.print(op);

	}
	
	static List<Integer> spiral(int[][] matrix){
		List<Integer> res = new ArrayList<>();
		
		if(matrix.length==0) {
			return res;
		}
		
		int colbegin=0;
		int rowbegin=0;
		int rowEnd = matrix.length-1;
		int colEnd = matrix[0].length-1;
		
		
		while(rowbegin <=rowEnd && colbegin <=colEnd) {
			//right
			for(int j=rowbegin; j<=colEnd;j++) {
				res.add(matrix[rowbegin][j]);
			}
			rowbegin++;
			
			//bottam
			for(int j=rowbegin;j<=rowEnd;j++) {
				res.add(matrix[j][colEnd]);
				
			}
			colEnd--;
			
			//left
			
			if(rowbegin<=rowEnd) {
			for(int j =colEnd;j>=colbegin;j--) {
				res.add(matrix[rowEnd][j]);
				
			}
			}
			rowEnd--;
			
			//up
			
			if(colbegin<=colEnd) {
				for(int j=rowEnd;j>=rowbegin;j--) {
					res.add(matrix[j][colbegin]);
				}
				
			}
			colbegin++;
		}	
		
		
		return res;
		}
	}

