package Repository;

import org.springframework.data.repository.CrudRepository;

import IndivProject.PracticeTapes;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PTRepository extends CrudRepository<User, Integer> {

}