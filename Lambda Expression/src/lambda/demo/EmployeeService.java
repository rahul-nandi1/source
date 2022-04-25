package lambda.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {
	
	public List<Employee> getEmployeesinSort(){
		List<Employee> emp= new EmployeeDAO().getEmployees();
		Collections.sort(emp,(o1,o2)-> o1.getName().compareTo(o2.getName()));

		
			
		//	@Override
		//	public int compare(Employee o1, Employee o2) {
		//		return o2.getName().compareTo(o1.getName());
		//	} 
			
	
		return emp;
	} 
	
/*	public List<Employee> getEmployeesinSort(){
		
		List<Employee> emp = new EmployeeDAO().getEmployees();
		Collections.sort(emp, new MyComparator());
		return emp;
		
	}*/


	public static void main(String[] args) {
		
		System.out.println(new EmployeeService().getEmployeesinSort());
	}
}


/* class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getName().compareTo(o1.getName());
	}
	
	
}*/
