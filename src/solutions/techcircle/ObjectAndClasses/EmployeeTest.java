package solutions.techcircle.ObjectAndClasses;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {


		 Employee empOne = new Employee("James Smith");
         Employee empTwo = new Employee("Mary Anne");

         // Invoking methods for each object created
         empOne.empAge(26);
         empOne.empDesignation("Senior Software Engineer");
         empOne.empSalary(125000);
         empOne.printEmployee();
         
         System.out.println("-----------------------");

         empTwo.empAge(21);
         empTwo.empDesignation("Software Engineer");
         empTwo.empSalary(110000);
         empTwo.printEmployee();
         
         ArrayList<Employee> list1s = new ArrayList<Employee>();
         //ArrayList<Data type> list1s = new ArrayList<Data type>();
         

	}

}
