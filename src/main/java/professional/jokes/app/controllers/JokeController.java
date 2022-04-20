package professional.jokes.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import professional.jokes.app.services.JokeService;

@Controller
public class JokeController {

	private final JokeService jokeService;

	//@Autowired
	public JokeController(JokeService jokeService) {
		
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""})
	public String showJoke(Model model)
	{
		model.addAttribute("joke",jokeService.getJoke());
		
		return "index";
	}
	
}
