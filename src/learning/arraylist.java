package learning;

import java.util.ArrayList;
import java.util.HashMap;

public class arraylist {
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList <String>() ;
		list.add("akanksha");
		list.add("aki");
		list.add("singh");
		
		System.out.println("elements of list" +list);
		
		
		HashMap <Integer, String> hm = new HashMap <Integer, String>();
		
		hm.put(1, "a");
		hm.put(2, "b");
		
		System.out.println("elements of list" +hm);
	}

}
