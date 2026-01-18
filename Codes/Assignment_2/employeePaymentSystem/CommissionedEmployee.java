package employeePaymentSystem;

class CommissionedEmployee extends Employee {
    private double commissionRate;
    private double totalSales;

    public CommissionedEmployee(String name, int employeeId, double commissionRate, double totalSales) {
        super(name, employeeId);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }

    @Override
    public double getPayment() {
        return (commissionRate * totalSales) / 100;
    }
}
