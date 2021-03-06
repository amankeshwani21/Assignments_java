package com.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="address")
public class Address {
	@Id
	@GeneratedValue
	@Column (name="pincode")
    int pincode;
	
	@Column (name="city")
    String city;
   
   public Address() {
		
	}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Address(int pincode, String city) {
	super();
	this.pincode = pincode;
	this.city = city;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + pincode;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Address other = (Address) obj;
	if (pincode != other.pincode)
		return false;
	return true;
}
@Override
public String toString() {
	return "[pincode=" + pincode + ", city=" + city + "]";
}
   
}

