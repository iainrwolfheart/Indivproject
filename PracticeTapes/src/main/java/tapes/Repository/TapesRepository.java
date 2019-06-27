package tapes.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import tapes.Persistence.Tapes;

public interface TapesRepository extends JpaRepository<Tapes, Integer> {

}