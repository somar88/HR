package com.company.model;

public class Phone {

	private Phone_type type;
	private String phone_number;
	private String comments;

	public Phone() {
		this.type = Phone_type.OTHER;
		this.phone_number = "";
		this.comments = "Default";
	}

	@Override
	public String toString() {
		return this.type.toString() + ": " + this.phone_number + " - " + this.comments;
	}

}

enum Phone_type {
	WORK, MOBILE_WORK, HOME, PRIVATE, OTHER
}
