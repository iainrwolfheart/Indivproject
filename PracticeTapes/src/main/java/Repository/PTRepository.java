package Repository;

import org.springframework.data.repository.CrudRepository;

import Persistence.ptuploads;

public interface PTRepository extends CrudRepository<ptuploads, Long> {
								//Unsure if use of 'Long' is correct????????????????
}