package tapes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tapes.Persistence.Tapes;

public interface TapesRepository extends JpaRepository<Tapes, Integer> {

	//void removeByName(Tapes tape);

}