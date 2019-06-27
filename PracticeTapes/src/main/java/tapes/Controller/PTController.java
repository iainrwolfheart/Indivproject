package tapes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tapes.Persistence.Tapes;
import tapes.Repository.TapesRepository;

@Controller    
@RequestMapping(path="/tapes") 
public class PTController {
	@Autowired 
	private TapesRepository tapesRepository;

	@GetMapping(path="/woo")
	public String test() {
		return "Hello!";
	}

	@GetMapping(path="/add")
	public @ResponseBody String addNewTapes (@RequestParam Integer id, String song_name
			, @RequestParam String url_link) {

		Tapes n = new Tapes();
		n.setId(id);
		n.setSongName(song_name);
		n.setURL(url_link);
		tapesRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Tapes> getAllTapes() {
		return tapesRepository.findAll();
	}
}