package com.search.catalog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekTest {
	public static void main(String arg[]) {
		Employee e1=new Employee();
		e1.setEmpid(100);
		e1.setEmpname("ranjan");
		
		Employee e2=new Employee();
		e1.setEmpid(200);
		e1.setEmpname("ranjan");

		
		Employee e3=new Employee();
		e1.setEmpid(300);
		e1.setEmpname("ranjan");

		
		Employee e4=new Employee();
		e1.setEmpid(400);
		e1.setEmpname("ranjan");
		
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		int i=0;
		List<Employee> emplist1 = emplist.stream().peek(e-> e.setEmpid(e.getEmpid()+1)).
				peek(e->e.setEmpname(e.getEmpname()+"_"+i)).collect(Collectors.toList());
		emplist1.forEach(e->System.out.println(e.getEmpid() +"--"+e.getEmpname()));
	}
	
	
	

	
	static class Employee {
		int empid;
		String empname;
		
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		
		public void changeit() {
			
		}
		
	}

}

