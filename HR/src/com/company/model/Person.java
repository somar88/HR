package com.company.model;

import java.util.Date;

public class Person {

	private String first_name;
	private String last_name;
	private String middle_name;
	private Address addresses;
	private Phone phone_numbers;
	private Gender gender;
	private String social_security_num;
	private Date birth_day;
	private String birth_place;

	public Person() {
		this.first_name = "First";
		this.last_name = "Last";
		this.middle_name = "Middle";
		this.gender = Gender.NATURAL;
		this.social_security_num = "";
		this.birth_day = new Date();
		this.birth_place = "N/A";
		this.addresses = new Address();
		this.phone_numbers = new Phone();
	}

	public String toString() {
		return  "First" + this.first_name + "\n" + 
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getSocial_security_num() {
		return social_security_num;
	}

	public void setSocial_security_num(String social_security_num) {
		this.social_security_num = social_security_num;
	}

	public Date getBirth_day() {
		return birth_day;
	}

	public void setBirth_day(Date birth_day) {
		this.birth_day = birth_day;
	}

	public String getBirth_place() {
		return birth_place;
	}

	public void setBirth_place(String birth_place) {
		this.birth_place = birth_place;
	}

}

enum Gender {

	FEMAL, MALE, NATURAL

}
