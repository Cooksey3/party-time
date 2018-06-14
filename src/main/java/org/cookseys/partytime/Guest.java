package org.cookseys.partytime;

public class Guest {

	private String firstName;
	private String lastName;
	private Integer numberOfGuests;
	
	public Guest(String firstName, String lastName, Integer numberOfGuests) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberOfGuests = numberOfGuests;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getNumberOfGuests() {
		return numberOfGuests;
	}
	
}
