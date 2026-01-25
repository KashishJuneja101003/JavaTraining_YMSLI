package unifiedPaymentSystem;

public class Vendor implements Payable{
	private int invoiceId;
	private String itemDescription;
	private double quantity;
	private double pricePerUnit;
	
	
	
	public Vendor(int invoiceId, String itemDescription, double quantity, double pricePerUnit) {
		super();
		this.invoiceId = invoiceId;
		this.itemDescription = itemDescription;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	@Override
	public double getPayment() {
		return quantity*pricePerUnit;
	}
	
	@Override
	public String toString() {
	    return "Vendor -> Invoice id: " + invoiceId;
	}


}
