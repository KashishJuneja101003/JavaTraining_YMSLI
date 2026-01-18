package unifiedPaymentSystem;

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	public SalariedEmployee(String name, int empId, double weeklySalary) {
		super(name, empId);
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double getPayment() {
		return weeklySalary;
	}
	
	@Override
	public String toString() {
		return ("Salaried Employee -> Id: " + getEmpId());
	}
}
