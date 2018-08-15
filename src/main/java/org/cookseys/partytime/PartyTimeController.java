package org.cookseys.partytime;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartyTimeController {

	@Resource
	private GuestRepository guestRepo;

	@RequestMapping("/home")
	public String getAllGuests(Model model) {
		model.addAttribute("guestsModel", guestRepo.findAll());
		return "home";
	}

}
