package com.company.model;

public class Address {

	private String country;
	private String state;
	private String county;
	private String district;
	private String city;
	private String neighbourhood;
	private String street_name;
	private String street_number;
	private String apartment_number;
	private String house_number;

	public Address() {
		this.country= "Country";
		this.state= "State";
		this.county= "County";
		this.district= "District";
		this.city= "City";
		this.neighbourhood= "Neighbourhood";
		this.street_name= "St. Name";
		this.street_number= "St. No.";
		this.apartment_number= "Apt No.";
		this.house_number= "House No.";
	}
	
	@Override
	public String toString(){
		return 
				"Country: " + this.country + "\n" +
				"State: " + this.state + "\n" +
				"County: " + this.county + "\n" +
				"District: " + this.district + "\n"+
				"City: " + this.city + "\n" +
				"Neighbourhood: " + this.neighbourhood + "\n" +
				"St. Name: " + this.street_name + "\n" +
				"St. No.: " + this.street_number + "\n" +
				"Apt No.: " + this.apartment_number + "\n" +
				"House No.: " + this.house_number + "\n";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNeighbourhood() {
		return neighbourhood;
	}

	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getStreet_number() {
		return street_number;
	}

	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}

	public String getApartment_number() {
		return apartment_number;
	}

	public void setApartment_number(String apartment_number) {
		this.apartment_number = apartment_number;
	}

	public String getHouse_number() {
		return house_number;
	}

	public void setHouse_number(String house_number) {
		this.house_number = house_number;
	}

}
