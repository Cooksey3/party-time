package org.cookseys.partytime;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartyTimeController {

	@Resource
	private RestaurantRepository restaurantRepo;

	@RequestMapping("/home")
	public String getAllGuests(Model model) {
		model.addAttribute("restaurantModel", restaurantRepo.findAll());
		return "home";
	}

}
