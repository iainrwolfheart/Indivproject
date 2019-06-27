package tapes.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tapes.Repository.TapesRepository;

@Service
public class TapesService implements TapesServiceInterface {
	
	@Autowired
	private TapesRepository tapesRepository;

//	public Optional<Tapes> findBySongName(String song_name) {
//		return tapesRepository.findBySongName(song_name);
//	}
}