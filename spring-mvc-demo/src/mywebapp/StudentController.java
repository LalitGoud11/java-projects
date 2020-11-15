package mywebapp;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/children")
public class StudentController {
	
	@InitBinder
	public void initbinder(WebDataBinder webdatabinder) {
		
		StringTrimmerEditor stringtrimmereditor = new StringTrimmerEditor(true);
		
		webdatabinder.registerCustomEditor(String.class, stringtrimmereditor);
		
		
	}

	@RequestMapping("studentform")
	public String studentForm(Model myModel) {
		Student student= new Student();
		
		myModel.addAttribute("student",student);
		
		return "student-form";
	}
	
	
	
	@RequestMapping("displayfile")
	public String displayForm(@Valid @ModelAttribute("student") Student theStudent,
			BindingResult thebindingresult) {
		
		if(thebindingresult.hasErrors()) {
			return "student-form";
		}
		else {
			return "display-file";
		}
		
		
	}
	
}
