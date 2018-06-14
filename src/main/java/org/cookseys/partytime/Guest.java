package org.cookseys.partytime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Guest {

	@Id
	@GeneratedValue
	private Long id;
	
	private String firstName;
	private String lastName;
	private Integer age;

	@JsonIgnore
	private Guest() {}
	
	public Guest(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}
	
}
