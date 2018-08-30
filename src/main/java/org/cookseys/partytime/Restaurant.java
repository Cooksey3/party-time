package org.cookseys.partytime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Restaurant {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String url;
	private String image;
	private String foodType;

	public String getName() {
		return name;
	}

	public String getFoodType() {
		return foodType;
	}

	public String getUrl() {
		return url;
	}

	public String getImage() {
		return image;
	}

	public Long getId() {
		return id;
	}

	@JsonIgnore
	public Restaurant() {
	}

	public Restaurant(String name, String url, String image, String foodType) {
		this.name = name;
		this.url = url;
		this.image = image;
		this.foodType = foodType;
	}

}