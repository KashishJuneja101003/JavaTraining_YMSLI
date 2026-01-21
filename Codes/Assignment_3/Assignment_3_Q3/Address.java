package Assignment_3_Q3;

import java.io.Serializable;

public class Address implements Serializable{
	private String state;
	private String district;
	private int pincode;
	
	public Address(String state, String district, int pincode) {
		super();
		this.state = state;
		this.district = district;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", district=" + district + ", pincode=" + pincode + "]";
	}
	
	
}
