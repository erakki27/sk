package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sortheight {
	
	public static void main(String[] args) {
				
				int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
				
				/*int [] op = solution(a);
				for(int k=0;k<op.length;k++) {
					System.out.println(op[k]);
				}*/
				solution(a);

			}
	
	static int[] solution(int[] a) {
	      
	      
	      int[] temp = a.clone();
	      Arrays.sort(a);
	      
	      List<Integer> list = new ArrayList<Integer>();
	      
	      for(int n:a){
	          
	          if(n!=-1)
	              list.add(n);
	              
	          }
	          for(int i=0,j=0;i<temp.length;i++){
	              if(temp[i] !=-1){
	                 temp[i] = list.get(j);
	               
	                  j++;
	                 
	                 
	              }
	              System.out.println(temp[i]);
	              
	             
	          }
	         
	      return temp;
	      
	}


}
