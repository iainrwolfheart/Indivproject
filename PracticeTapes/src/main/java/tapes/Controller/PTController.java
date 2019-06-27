package tapes.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import tapes.Persistence.Tapes;
import tapes.Repository.TapesRepository;

@Controller    
@RequestMapping("/tapes") 
public class PTController {
	
	@Autowired 
	private TapesRepository tapesRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody String addNewTapes (@RequestBody Tapes tape) {
        tapesRepository.save(tape);
        return "Saved";
    }
    
    @GetMapping(value = "/all")
    public @ResponseBody Iterable<Tapes> getAllTapes(){
        return tapesRepository.findAll();
    }
    
}