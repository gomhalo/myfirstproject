package org.sambasoft.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.Valid;



@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String fname;
	private String lname;
	private String mname;
	private double amaunt;
	
	@Valid
	@OneToOne(cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "address_Id")
	private Address address;
	
	public User(String fname,String mname, String lname,double amount) {
		this.fname = fname;
		this.fname = mname;
		this.lname = lname;
		this.amaunt = amaunt;
	}
	
	
	public User() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getAmaunt() {
		return amaunt;
	}
	public void setAmaunt(double amaunt) {
		this.amaunt = amaunt;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ",mname=" + mname + ", amaunt=" + amaunt + "]";
	}
}
