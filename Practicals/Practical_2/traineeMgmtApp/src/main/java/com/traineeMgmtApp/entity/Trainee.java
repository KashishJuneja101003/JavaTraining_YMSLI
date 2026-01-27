package com.traineeMgmtApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trainee")
public class Trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "trainee_name", nullable = false)
	private String traineeName;
	

	@Column(name = "branch", nullable = false)
	private String branch;
	
	@Column(name = "percentage", nullable = false)
	private double percentage;

	public Trainee(String traineeName, String branch, double percentage) {
		this.traineeName = traineeName;
		this.branch = branch;
		this.percentage = percentage;
	}

	public Trainee() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", traineeName=" + traineeName + ", branch=" + branch + ", percentage="
				+ percentage + "]";
	}	
}
