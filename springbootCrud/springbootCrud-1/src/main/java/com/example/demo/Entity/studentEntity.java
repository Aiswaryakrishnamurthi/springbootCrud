package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class studentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollNo;
	@Override
	public String toString() {
		return "studentEntity [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", branch="
				+ branch + "]";
	}
	public studentEntity(){
		
	}
	public studentEntity(int rollNo, String name, float percentage, String branch) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
		this.branch = branch;
	}
	private String name;
	private float percentage;
	private String branch;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
