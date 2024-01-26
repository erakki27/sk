package learning;

import java.util.ArrayList;
import java.util.Iterator;

public class collectionslearning {

	public static void main(String[] args) {
		
		EmployeeCollectio e1 = new EmployeeCollectio("ak",25,"QA");
		EmployeeCollectio e2 = new EmployeeCollectio("akk",27,"dev");
		
		ArrayList<EmployeeCollectio> EC = new ArrayList<EmployeeCollectio>();
		
		EC.add(e1);
		EC.add(e2);
		
		Iterator<EmployeeCollectio> el = EC.iterator();
		
		while(el.hasNext()) {
			
			EmployeeCollectio emp = el.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dpt);
			
			
		}
			
			
		}

	}


