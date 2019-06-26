package Repository;

import org.springframework.data.repository.CrudRepository;

import Persistence.tapes;

public interface PTRepository extends CrudRepository<tapes, Long> {
								//Unsure if use of 'Long' is correct????????????????
}