package com.basic.java;

public class Demo {


			public static void main(String[] args) {
				Employee employee1 = new Employee(13,"Jeyapriya",10500f);
				employee1.display();
			
				
				Employee employee2 = new Employee();
				employee2.setEmpId(15);
				employee2.setEmpName("Prakash");
				employee2.setEmpSalary(16789f);
				employee2.display();

			
			
				if(employee1.empSalary>employee2.empSalary) {
					System.out.println("Jeyapriya getting higher salary");
				}else {
					System.out.println("Prakash getting higher salary");
					
				}
					

			}

		

}


