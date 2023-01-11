package com.prowings.beans;

public class Address {
	private String city;
	private String country;
	private int pin;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String country, int pin) {
		super();
		this.city = city;
		this.country = country;
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("set city is invoked...");
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		System.out.println("set country is invoked...");
		this.country = country;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		System.out.println("set pin is invoked...");
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}



}
