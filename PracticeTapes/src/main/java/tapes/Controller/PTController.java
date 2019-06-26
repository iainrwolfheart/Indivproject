package tapes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tapes.Persistence.Tapes;
import tapes.Repository.TapesRepository;

@RestController    
@RequestMapping(path="/Tapes") 
public class PTController {
	
	@Autowired 
	private TapesRepository tapesRepository;

	@GetMapping(path="/woo")
	public String test() {
		return "Hello!";
	}

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
	public @ResponseBody Iterable<tapes.Persistence.Tapes> getAllTapes() { ////COULD BE WRONG..?
		return tapesRepository.findAll();
	}
}