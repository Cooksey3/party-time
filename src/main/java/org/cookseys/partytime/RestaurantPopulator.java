package org.cookseys.partytime;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RestaurantPopulator implements CommandLineRunner {

	@Resource
	RestaurantRepository restaurantRepo;
	
	@Override
	public void run(String... args) throws Exception {

		restaurantRepo.save(new Restaurant("Papa Johns", "https://www.papajohns.com/", "image", "pizza"));
		restaurantRepo.save(new Restaurant("Donatos", "https://www.donatos.com/", "image", "pizza"));
		restaurantRepo.save(new Restaurant("Little Caesars", "https://littlecaesars.com/en-us/", "image", "pizza"));
		
		
	}

}
