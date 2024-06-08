package learning;

import java.util.Arrays;

public class sumofmaxmin {

	public static void main(String[] args) {
		int[] A = {-650, 950, -912, -329, 412, 835, 608, 546, -451, -233, -400, -918, -257, 189, -975, -695, -780, 530, 102, 856, -247, -729, 656, -237, 815, 336, 217, -688, 874, -62, -401, -354, 5, 806, -567, -257, 525, 998, 12, -602, -632, 1, -898, -131, -282, -251, 609, -223, -200, -376, 906, -418, 899, 302, 251, 1000, 174, -496, 336, -873, -669, -492, 847, 90, -417, -53, 464, -342, -92, -327, -93, 514, 182, 986, 807, -584, -924, 85, 787, -423, 406, -655, 946, 693 };
		
		sum(A);
		sum1(A);
		
	}
		// TODO Auto-generated method stub
	
		static int sum(int[] A) {
		
		int n = A.length;
		
		Arrays.sort(A);
		
		
		int sum = A[0]+A[n-1];
		
		System.out.println(sum);
		return sum;
		}
		
		static int sum1(int[] A) {
			int sum=0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int a : A) {
			if(a>max) {
				max=a;
				
			}if(a<min) {
				min=a;
				
			}
			}
			System.out.println(sum= max+min);
			return sum;
			
		}
	}

