package lambda.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	List<Employee> getEmployees(){
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101,"Rahul",20000));
		emp.add(new Employee(102,"Smruty",21000));
		emp.add(new Employee(103,"Rashi",25000));
		emp.add(new Employee(104,"Rakesh",14000));
		emp.add(new Employee(105,"Anikesh",24000));
		return emp;
	}


}
