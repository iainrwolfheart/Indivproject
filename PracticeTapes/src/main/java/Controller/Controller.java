package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Persistence.Tapes;
import Repository.TapesRepository;

@RestController    
@RequestMapping(path="/tapes") 
public class Controller {
	
	@Autowired 
	private TapesRepository tapesRepository;

	@GetMapping(path="/add")
	public @ResponseBody String addNewTapes (@RequestParam String song_name
			, @RequestParam String url_link) {

		Tapes n = new Tapes();
		n.setSongName(song_name);
		n.setURL(url_link);
		tapesRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Persistence.Tapes> getAllTapes() { ////COULD BE WRONG..?
		return tapesRepository.findAll();
	}
}