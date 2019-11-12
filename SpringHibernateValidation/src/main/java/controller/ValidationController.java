package controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import controller.model.User;

@Controller
public class ValidationController {

	@RequestMapping("")
	public String viewPage(Model model) {
		model.addAttribute("user", new User());
		return "input";
	}
	
	@PostMapping("add")
	public String validasi(@Valid User user,BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()) {
			System.out.println(bindingResult.getFieldError());
			model.addAttribute("user", user);
			return "input";
		}
		return "home";
	}
}
