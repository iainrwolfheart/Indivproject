package Repository;

import org.springframework.data.repository.CrudRepository;

import Persistence.Tapes;

public interface TapesRepository extends CrudRepository<Tapes, Integer> {
								/////////////Don't understand this^, could be an issue...
}