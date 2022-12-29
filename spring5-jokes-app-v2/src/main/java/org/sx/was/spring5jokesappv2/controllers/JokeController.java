package org.sx.was.spring5jokesappv2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.sx.was.spring5jokesappv2.services.JokeService;

@Controller
public class JokeController {

	private final JokeService jokeService;

	public JokeController(JokeService jokeService) {
		
		this.jokeService = jokeService;
	}
	
	@GetMapping(path = {"/", ""})
	public String showJoke(Model model) {
		
		model.addAttribute("joke", jokeService.getJoke());
		
		return "index";
	}
}
