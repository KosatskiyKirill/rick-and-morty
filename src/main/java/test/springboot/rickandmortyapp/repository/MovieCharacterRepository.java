package test.springboot.rickandmortyapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.springboot.rickandmortyapp.model.MovieCharacter;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface MovieCharacterRepository extends JpaRepository<MovieCharacter, Long> {
    List<MovieCharacter> findAllByExternalIdIn(Set<Long> externalIds);

    Optional<MovieCharacter> findByNameContains(String argument);
}
