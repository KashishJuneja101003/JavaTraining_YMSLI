package employeePaymentSystem;

import java.util.ArrayList;

public class EmployeeApp {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new SalariedEmployee("SE1", 101, 1200));
		employees.add(new HourlyEmployee("HE1", 201, 20, 40));
		employees.add(new CommissionedEmployee("CE1", 301, 10, 5000));
		
		for(Employee emp:employees) {
			System.out.println(
					"\nEmployee Id: " + emp.getEmpId() +
					", Name: " + emp.getName() + 
					", Weekly Salary: $" + emp.getPayment()
			);
		}
	}

}
