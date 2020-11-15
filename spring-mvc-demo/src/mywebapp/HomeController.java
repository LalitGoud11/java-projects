package mywebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu"; // Initially it was main-menu.ive changed it.
	}
	
	@RequestMapping("/showNextPage")
	public String shownextPage() {
		return "nextPage";
	}
	
	@RequestMapping("/collectPageNext")
	public String collectpage() {
		return "collectpage";
	}
	
}
