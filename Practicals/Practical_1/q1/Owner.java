package com.practical.q1;

public class Owner {
	private String name;
	private Date date;
	private String nic;
	
	public Owner() {}

	public Owner(String name, Date date, String nic) {
		this.name = name;
		this.date = date;
		this.nic = nic;
	}
	
	public Owner(Owner owner) {
		this.name = owner.name;
		this.date = owner.date;
		this.nic = owner.nic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	@Override
	public String toString() {
		return "Owner: " + name + "\nNic: " + nic + "\n" + date;
	}
	
}
