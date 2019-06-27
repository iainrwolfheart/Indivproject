package tapes.Repository;

import org.springframework.data.repository.CrudRepository;

import tapes.Persistence.Tapes;

public interface TapesRepository extends CrudRepository<Tapes, Integer> {
								
}