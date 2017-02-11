package com.company.model;

public class Person {

	private String first_name;
	private String last_name;
	private String middle_name;
	private Address addresses;
	private Phone phone_numbers;

	public Person() {
		this.first_name = "First";
		this.last_name = "Last";
		this.middle_name = "Middle";
		this.addresses = new Address();
		this.phone_numbers = new Phone();
	}

	public String toString() {
		return "First" + this.first_name + "\n" + 
				"Last" + this.last_name + "\n" + 
				"Middle" + this.middle_name + "\n"+ 
				"Phone: \n" + this.phone_numbers.toString() + "\n" + 
				"Address \n" + this.addresses.toString();
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

}
