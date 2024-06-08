package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class primenumber {
	
	public static void main(String[] args) {
		
		int a;
		Integer b[] = {3,12,13,15};
		List<Integer> al = new ArrayList<Integer>(Arrays.asList(b));
		System.out.println("Original List => " + al);
        keepOnlyCompositeNumbers(al);
        System.out.println("FInal List => " + al);
		
		//prime(127);
		
	}
	
	static boolean prime(int a) {
		int flag=0;
		
		/*
		 * if(a==0 || a==1) { System.out.println("not prime");
		 * 
		 * }else {
		 */
			for(int i=2;i<a;i++) {
				if(a%i==0) {
					//System.out.println("not prime");
					return false;
				}			
			}
			return true;
		
			}
	
	public static void keepOnlyCompositeNumbers(List<Integer> al) {

        for (int i = 0 ; i < al.size() ; i++) {
            if (prime(al.get(i))) {
                al.remove(i);
            }
        }
    }

	}