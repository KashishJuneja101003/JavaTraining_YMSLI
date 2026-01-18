package employeePaymentSystem;

public class HourlyEmployee extends Employee{
	private double hourlyRate;
	private double hoursWorked;
	
	public HourlyEmployee(String name, int empId, double hourlyRate, double hoursWorked) {
		super(name, empId);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public double getPayment() {
		return hourlyRate * hoursWorked;
	}
}
