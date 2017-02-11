package com.company.model;

public class Phone {

	private Phone_type type;
	private String phone_nember;
	private String comments;

	public Phone() {
		this.type = Phone_type.OTHER;
		this.phone_nember = "";
		this.comments = "Default";
	}

	@Override
	public String toString() {
		return this.type.toString() + ": " + this.phone_nember + " - " + this.comments;
	}

}

enum Phone_type {

	WORK, MOBILE_WORK, HOME, PRIVATE, OTHER

}
