package IndivProject.PracticeTapes.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import IndivProject.PracticeTapes.Repositories.TapesRepository;
import IndivProject.PracticeTapes.tapes.Tapes;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/tapes") 
public class TapesController {
	
	@Autowired
	private TapesRepository tapesRepository;
	
	@GetMapping
	public List<Tapes> list() {
		return tapesRepository.findAll();
	}
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Tapes tape) {
		tapesRepository.save(tape);
	}
	@GetMapping("/findsong/{id}}") 
	public Tapes get(@PathVariable("id") long id) {  
		return tapesRepository.getOne(id);
	}
}
