package org.cookseys.partytime;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PartyTimePopulator implements CommandLineRunner {

	@Resource
	GuestRepository guestRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Guest guest = new Guest("Bilbo", "Baggins", 25);
		
		guestRepo.save(guest);
		
	}

}
