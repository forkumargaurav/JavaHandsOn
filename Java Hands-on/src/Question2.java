//Question2
import java.util.*;
class Employee {
	private float salary, hours;
//constructor calling
	public Employee() {
		salary = 0;
		hours = 0;
	}
	
	public void getInfo(float sal, float hr) {
		salary = sal;
		hours = hr;
	}
	
	public float AddSal() {
		if(salary<500) {
			salary = salary + 100;
		}
		return salary;
	}
	
	public float AddWork() {
		if(hours > 6) {
			salary = salary + 50;
		}
		return salary;
	}
}

class Final_Salary {
	float salary;
		public Final_Salary(float sal) {
		salary = sal;
	}
	
	public void printSal() {
		System.out.println("Salary : " + salary);
	}
}

public class Question2 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		// taking input of employee details 
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter salary");
		float salary = obj.nextFloat();
		System.out.println("Enter number of hours of work");
		float hours = obj.nextFloat();
		
		// calling methods of Employee class 
		emp.getInfo(salary, hours);
		salary = emp.AddSal();
		salary = emp.AddWork();
		
		Final_Salary obj1 = new Final_Salary(salary);  // pass salary obtained from the methods of the Employee class as parameter */
		obj1.printSal();  // calling method of Final_Salary class to print final salary 
	}
}
